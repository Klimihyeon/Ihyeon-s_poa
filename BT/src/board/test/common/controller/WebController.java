package board.test.common.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.test.common.handler.CommandHandler;
import board.test.common.handler.NullHandler;

public class WebController extends HttpServlet {
	
	private static Logger LOGGER = Logger.getLogger("WebController.class");
	
	private Map<String, CommandHandler> cmmHandlerMap = new HashMap<>();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String configFilePath = config.getInitParameter("handler-config");
		
		LOGGER.info("★ configFilePath : " + configFilePath);
		
		Properties handlerProp = new Properties();
		
		String configFileRealPath = config.getServletContext().getRealPath(configFilePath);
		
		LOGGER.info("★ configFileRealPath : " + config.getServletContext());
		
		FileReader fr;
		
		try {
			fr = new FileReader(configFileRealPath);
			handlerProp.load(fr);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		for(Object key : handlerProp.keySet()) {
			String command = (String) key;
			
			try {
				Class<?> klass = Class.forName(handlerProp.getProperty(command));
				CommandHandler handler = (CommandHandler) klass.newInstance();
				cmmHandlerMap.put(command,  handler);
			} catch(Exception ex) {
				ex.printStackTrace();
				throw new ServletException();
			}
		}
		
		Set<Map.Entry<String, CommandHandler>> entrySet = cmmHandlerMap.entrySet();
		for(Map.Entry<String, CommandHandler> entry : entrySet) {
			LOGGER.info(entry.getKey() 
			+ " => " + entry.getValue());
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String reqURI = req.getRequestURI();
		
		if(reqURI.indexOf(req.getContextPath()) == 0) { 
			reqURI = reqURI.substring(req.getContextPath().length());
		}
		
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("command : " + reqURI);
			LOGGER.info("cmmHandlerMap : " + cmmHandlerMap);
		}
		
		CommandHandler handler = cmmHandlerMap.get(reqURI); 
		
		if(handler == null) { 
			handler = new NullHandler(); 
		}
		
		String viewPage = "";
		try {
			viewPage = handler.process(req, resp); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		LOGGER.info("viewPage : " + viewPage);
		

		if(viewPage != null) {
			if(handler.isRedirect(req)) {
				resp.sendRedirect(viewPage);
			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(viewPage);
				
				dispatcher.forward(req,  resp);
			}
		}
	}
}

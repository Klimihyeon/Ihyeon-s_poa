package board.test.common.handler;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandHandler {

	public boolean isRedirect(HttpServletRequest req);
	
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}

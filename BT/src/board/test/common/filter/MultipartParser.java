package board.test.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadException;

import board.test.util.FileUploadRequestWrapper;

public class MultipartParser implements Filter{
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;
	private static final long MAX_FILE_SIZE = 1024 * 1024 * 40;
	private static final long MAX_REQUEST_SIZE = 1024 * 1024 * 50;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		
		FileUploadRequestWrapper requestWrapper;
		try {
			requestWrapper = new FileUploadRequestWrapper(
					(HttpServletRequest) req, 
					MEMORY_THRESHOLD,
					MAX_FILE_SIZE,
					MAX_REQUEST_SIZE,
					"");
			fc.doFilter(requestWrapper, resp);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {
		
	}

}

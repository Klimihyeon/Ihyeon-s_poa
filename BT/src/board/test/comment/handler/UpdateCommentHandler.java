package board.test.comment.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.test.comment.service.CommentServiceImpl;
import board.test.comment.service.ICommentService;
import board.test.comment.vo.CommentVO;
import board.test.common.handler.CommandHandler;

public class UpdateCommentHandler implements CommandHandler {

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equals("GET")) { 
			return true;
		}else { 
			return true;
		}
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getMethod().equals("GET")) {
			return null;

		} else { 
			long boardSeq = Long.parseLong(req.getParameter("boardSeq"));
			String code = req.getParameter("code");
			
			CommentVO cv = new CommentVO();
			cv.setReplySeq(Long.parseLong(req.getParameter("replySeq")));
			cv.setReplyContent(req.getParameter("replyContent"));
			
			ICommentService service = CommentServiceImpl.getInstance();
			service.updateComment(cv);
			
			// 세션가져오기
			String userId = (String) req.getSession().getAttribute("USERID");
			
//			String redirectUrl = "";
//			if("admin2".equals(userId)) {
//				redirectUrl = req.getContextPath() + "/qnaBoard/select.do?boardSeq=" + boardSeq;
//			} else {
//				redirectUrl = req.getContextPath() + "/qnaBoard/select.do?boardSeq=" + boardSeq;
//			}
			
			String redirectUrl = req.getContextPath() + "/" + code + "/select.do?boardSeq=" + boardSeq;
			
//			String redirectUrl = req.getContextPath() + "/commBoard/select.do?boardSeq=" + boardSeq;
			
			return redirectUrl;
		}
	}	

}

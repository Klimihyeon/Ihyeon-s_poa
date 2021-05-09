package board.test.comment.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.test.comment.service.CommentServiceImpl;
import board.test.comment.service.ICommentService;
import board.test.comment.vo.CommentVO;
import board.test.common.handler.CommandHandler;
	

public class InsertCommentHandler implements CommandHandler{
	
//	private static final String VIEW_PAGE = "#";
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equals("GET")) {
			return true;
		} else {
			return true;
		}
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		if(req.getMethod().equals("GET")) {
			return null;
		} else {
			
			// 새 댓글 담을 객체
			CommentVO cv = new CommentVO();

			// 서비스
			ICommentService service = CommentServiceImpl.getInstance();
			// 게시글 번호
			long boardSeq = Long.parseLong(req.getParameter("boardSeq"));
			String code = req.getParameter("code");
			
			cv.setCode(req.getParameter("code"));
			cv.setUserId(req.getParameter("userId"));
			cv.setReplyContent(req.getParameter("replyContent"));
			cv.setBoardSeq(boardSeq);
			
			service.insertComment(cv);
			
			// URL 통합 필요 (게시판코드로)
			String redirectUrl = req.getContextPath() + "/" + code + "/select.do?boardSeq=" + boardSeq;
			
			return redirectUrl;
			
		}
	}
}

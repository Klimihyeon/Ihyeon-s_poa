package board.test.board.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.test.board.service.CommBoardServiceImpl;
import board.test.board.service.ICommBoardService;
import board.test.board.vo.CommBoardVO;
import board.test.comment.service.CommentServiceImpl;
import board.test.comment.service.ICommentService;
import board.test.comment.vo.CommentVO;
import board.test.common.handler.CommandHandler;

public class GetCommBoardHandler implements CommandHandler{

	private static final String VIEW_PAGE = "/WEB-INF/view/commBoard/boardSelectForm.jsp";

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		// 게시글 번호 가져오기
		Long boardSeq= Long.parseLong(req.getParameter("boardSeq"));
		// 서비스 호출
		ICommBoardService boardService = CommBoardServiceImpl.getInstance();
		ICommentService commentService = CommentServiceImpl.getInstance();
		
		// 게시글 출력
		CommBoardVO cv= boardService.getBoard(boardSeq);
		req.setAttribute("boardVO", cv);
		req.setAttribute("cnt", 0);
		
		// 댓글 출력
		CommentVO ccv = new CommentVO();
		ccv.setCode("DEV");
		ccv.setBoardSeq(boardSeq);
		req.setAttribute("commentList", commentService.getCommentList(ccv));
		
		// 댓글 수
		req.setAttribute("commentCnt", commentService.getCommentCount(ccv));
		
		return VIEW_PAGE;
	}
	
	
	
	
}

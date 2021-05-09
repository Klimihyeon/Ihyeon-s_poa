package board.test.board.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.test.board.service.CommBoardServiceImpl;
import board.test.board.service.ICommBoardService;
import board.test.board.vo.CommBoardVO;
import board.test.common.handler.CommandHandler;
import board.test.common.vo.PagingVO;

public class GetAllClassBoardHandler implements CommandHandler{

	private static final String VIEW_PAGE = "/WEB-INF/view/commBoard/classBoardListMain.jsp";
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int pageNo = 
				req.getParameter("pageNo") == null ? 
				1 : Integer.parseInt(req.getParameter("pageNo"));
			
			PagingVO pagingVO = new PagingVO();
			
		ICommBoardService boardService = CommBoardServiceImpl.getInstance();
		
		int totalCount = boardService.getAllBoardListCount();
		pagingVO.setTotalCount(totalCount);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(5);
		pagingVO.setPageSize(5);
		
		List<CommBoardVO> boardList = boardService.getAllClassBoardList(pagingVO);
		
		req.setAttribute("boardList", boardList);
		req.setAttribute("pagingVO", pagingVO);
		
		return VIEW_PAGE;
	}

}

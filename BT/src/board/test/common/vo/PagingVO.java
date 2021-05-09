package board.test.common.vo;

public class PagingVO {

	private int pageCount = 10;		
	private int countPerPage = 10;	
	private int currentPageNo;		
	private int totalCount;			
	
	private int totalPageCount;		
	private int firstPageNo;		
	private int lastPageNo;			
	private int firstRecNo;			
	private int lastRecNo;			

	public int getCountPerPage() {
		return countPerPage;
	}

	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}

	public int getPageSize() {
		return pageCount;
	}

	public void setPageSize(int pageSize) {
		this.pageCount = pageSize;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getTotalPageCount() {
		totalPageCount = ((getTotalCount() - 1) / getCountPerPage()) + 1;
		return totalPageCount;
	}

	public int getFirstPageNo() {
		firstPageNo = ((getCurrentPageNo() - 1) / getPageSize()) * getPageSize() + 1;
		return firstPageNo;
	}
	
	public int getLastPageNo() {
		lastPageNo = getFirstPageNo() + getPageSize() - 1;
		if (lastPageNo > getTotalPageCount()) {
			lastPageNo = getTotalPageCount();
		}
		return lastPageNo;
	}
	
	public int getFirstRecNo() {
		firstRecNo = (getCurrentPageNo() - 1) * getCountPerPage() + 1;
		return firstRecNo;
	}
	
	public int getLastRecNo() {
		lastRecNo = getCurrentPageNo() * getCountPerPage();
		return lastRecNo;
	}
}
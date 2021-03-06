package board.test.board.vo;

import java.sql.Date;

import board.test.common.vo.PagingVO;

public class CommBoardVO extends PagingVO {

	private String code;
	private long boardSeq;
	private String userId;
	private String boardTitle;
	private Date boardDate;
	private String boardContent;
	private long atchFileId;
	private long boardHitsNumber;
	private String boardDelete;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(long boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public long getAtchFileId() {
		return atchFileId;
	}
	public void setAtchFileId(long atchFileId) {
		this.atchFileId = atchFileId;
	}
	public long getBoardHitsNumber() {
		return boardHitsNumber;
	}
	public void setBoardHitsNumber(long boardHitsNumber) {
		this.boardHitsNumber = boardHitsNumber;
	}
	public String getBoardDelete() {
		return boardDelete;
	}
	public void setBoardDelete(String boardDelete) {
		this.boardDelete = boardDelete;
	}
	
	
	
	
}

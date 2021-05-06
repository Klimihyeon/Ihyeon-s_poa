<%@page import="kr.or.ddit.adminBoard.vo.AdminBoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	List<AdminBoardVO> boardList = (List<AdminBoardVO>)request.getAttribute("boardList");
%>
<%@include file="/WEB-INF/view/common/top.jsp"%>

<main>
	<div class="container-fluid">
		<h1 class="mt-4 mb-4">Board Administration</h1>
		
		<ul class="nav nav-pills mb-4">
			<li class="nav-item"><a class="nav-link" href="noticeGetAll.do">공지</a></li>
			<li class="nav-item"><a class="nav-link active" href="faqGetAll.do">FAQ</a></li>
		</ul>
		<div class="card mb-4">
	    	<div class="card-body">
	        	자주 묻는 질문 관리 페이지입니다.
			</div>
		</div>
 
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table mr-1"></i>
					TB_ADMIN_BOARD
					<a type="button" class="btn btn-outline-danger btn-sm float-right" href="faqInsert.do">글쓰기</a>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
						<thead>
							<tr>
								<th>#</th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성일</th>
								<th>조회수</th>
								<th>작성 게시판</th>
								<th>삭제 여부</th>
								<th>관리</th>
							</tr>
						</thead>
						<tbody id="chk">
						<%
							int boardSize = boardList.size();
							if(boardSize > 0){
							for(int i = 0; i < boardSize; i++){
							System.out.print(boardList.get(i).toString());
						%>
							<tr>
								<td><%=boardList.get(i).getBoardSeq() %></td>
								<td><%=boardList.get(i).getBoardTitle() %></td>
								<td><%=boardList.get(i).getUserId()%></td>
								<td><%=boardList.get(i).getBoardDate() %></td>
								<td><%=boardList.get(i).getBoardHits() %></td>
								<td><%=boardList.get(i).getCode() %></td>
								<td><%=boardList.get(i).getBoardDelete() %></td>
								<td>
									<button type="button" onclick="fnGet(<%=boardList.get(i).getBoardSeq() %>)">조회</button>
								</td>
							</tr>
						<% 
								}
							}
						%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<form id="fm" method="post">
		<input type="hidden" id="boardList" name="boardSeq">
		<input type="hidden" id="boardList" name="code" value="faq">
	</form>
	<script type="text/javascript">
		function fnGet(data) {
		$("#fm").attr("action", "<%=request.getContextPath()%>/adminBoard/faqGet.do");
			$("#boardList").val(data);
			$("#fm").submit();
		}
	</script>
</main>

<%@include file="/WEB-INF/view/common/bottom.jsp"%>
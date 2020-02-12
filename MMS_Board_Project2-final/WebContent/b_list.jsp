<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"/>
	<c:choose>
		<c:when test="${not empty login}">
			<a href="binsertui.do">글쓰기</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')">글쓰기</a>
		</c:otherwise>
	</c:choose>
	<h1>게시판</h1>

	<table border="1">
		<thead>
			<tr>
				<th><a href="blist.do">num</a></th>
				<th>title</th>
				<th>작성자</th>
				<th>작성일</th>
				<th><a href="blistreadcnt.do">조회수</a></th>
				<th><a href="blistgoodcnt.do">좋아요</a></th>
				<th><a href="blistbadcnt.do">싫어요</a></th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.num}</td>
					<td>
					<!-- 들여쓰기 -->
					<c:forEach begin="1" end="${dto.repIndent}"> <!-- 원래 글은 들여쓰기가 안되게 1부터 시작 -->
						&nbsp;&nbsp;
					</c:forEach>
					<a href="bread.do?num=${dto.num}&curPage=${to.curPage}">${dto.title}</a></td>
					<td>${dto.author}</td>
					<td>${dto.writeday}</td>
					<td>${dto.readcnt}</td>
					<td>${dto.good}</td>
					<td>${dto.bad}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<c:choose>
	
		<c:when test="${listType == 'blist'}">
			<jsp:include page="b_page.jsp"/>
		</c:when>
		
		<c:when test="${listType == 'blistread'}">
			<jsp:include page="b_page_listreadcnt.jsp"/>
		</c:when>	
		
		<c:when test="${listType == 'blistgood'}">
			<jsp:include page="b_page_listgoodcnt.jsp"/>
		</c:when>		
		
		<c:when test="${listType == 'blistbad'}">
			<jsp:include page="b_page_listbadcnt.jsp"/>
		</c:when>	
			
		<c:otherwise>
			<jsp:include page="b_page_search.jsp"/>
		</c:otherwise>
	
	</c:choose>
	
			 <form action = "bsearch.do" method="get" style="diaplay:block ">
			 <select class="one" name="target" style="display:inline-block;with:82px;height:30px;margin-left:800px;">
			
			  <option value="0">제목</option>
			  <option value="1">내용</option>
			  <option value="2">제목+내용</option>
			  <option value="3">글쓴이</option>
			
			  </select>
			  <input style="height:30px;" type="text" size="20" name="condition"/>&nbsp;
			  <input type="submit" class="btn btn-primary" style="height:33px;" value="검색"/>
			 </form>
			 
	
	<jsp:include page="footer.jsp"/>


</body>
</html>
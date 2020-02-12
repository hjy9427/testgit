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
	
	<h1 style="text-align:center;">게시판</h1>
	
	<a href="blistreadcnt.do" style="margin-left:400px;">조회수 높은 글 보기</a>
	
	<div class="container">
	<table class="table table-striped" style="text-align:center; border:1px solid powderblue;">
		<thead>
			<tr>
				<th style="background-color:powderblue; text-align:center; color:black;">num</th>
				<th style="background-color:powderblue; text-align:left; color:black; ">title</th>
				<th style="background-color:powderblue; text-align:center; color:black;">작성자</th>
				<th style="background-color:powderblue; text-align:center; color:black; ">작성일</th>
				<th style="background-color:powderblue; text-align:center; color:black; ">조회수</th>
				<th style="background-color:powderblue; text-align:center; color:black; ">좋아요</th>
				<th style="background-color:powderblue; text-align:center; color:black; ">싫어요</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.num}</td>
					<td>
					<div align="left">
					<!-- 들여쓰기 -->
					<c:forEach begin="1" end="${dto.repIndent}" > <!-- 원래 글은 들여쓰기가 안되게 1부터 시작 -->
			 			&nbsp;
					</c:forEach>
					<c:forEach begin="1" end="${dto.repIndent}" > <!-- 원래 글은 들여쓰기가 안되게 1부터 시작 -->
			 			<c:set var = "str" value="re:"/>
			 			 ${str}
					</c:forEach>
					<a href="bread.do?num=${dto.num}">${dto.title}</a>
					</div>
					</td>	
					<td>${dto.author}</td>
					<td>${dto.writeday}</td>
					<td>${dto.readcnt}</td>
					<td>${dto.good}</td>
					<td>${dto.bad}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<%-- 페이징 --%>
	<%-- html주석(<!-- -->) 쓰지 말고 이 주석 쓰기!!!!!!!!! --%>
	<%-- 파람액션태그가 있을 때는  [[[ <jsp:include page=""></jsp:include> 없을때는 <jsp:include page=""/> ]]]  --%> 
	<div style="text-align:center;">
     <jsp:include page="b_page.jsp"/> 
	</div>
	
	<c:choose>
		<c:when test="${not empty login}">
		<a href="binsertui.do" class="btn btn-primary pull-right" style="width:7%; margin-left:5px;">글쓰기</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')" class="btn btn-primary pull-right" style="width:7%; margin-left:5px;">글쓰기</a>
		</c:otherwise>
	</c:choose>
	
	
	          
			 <form action = "bsearch.do" method="get" style="diaplay:block ">
			 <select class="one" name="target" style="display:inline-block;with:82px;height:30px;margin-left:400px;">
			
			  <option  value="0">제목</option>
			  <option value="1">내용</option>
			  <option value="2">제목+내용</option>
			  <option value="3">글쓴이</option>
			
			  </select>
			  <input style="height:30px;" type="text" size="20" name="condition"/>
			  <input type="submit" class="btn btn-primary" style="height:33px;" value="검색"/>
			 </form>
			 
	
	<%-- <jsp:include page="footer.jsp"/> --%>

</div>
</body>
</html>
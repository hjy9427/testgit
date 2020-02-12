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
    
	<div class="container">
<table class="table table-striped" style="text-align:center; border:1px solid powderblue;">
		<thead>
			<tr>
				<th style="background-color:powderblue; text-align:center; color:black;">num</th>
				<th style="background-color:powderblue; text-align:center; color:black; ">title</th>
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
					
					<c:forEach begin="1" end="${dto.repIndent}">
						&nbsp;&nbsp;
					</c:forEach>
					
					<a href="bread.do?num=${dto.num}">${dto.title}</a>
					
					</td>
					<td>${dto.author}</td>
					<td>${dto.writeday}</td>
					<td>${dto.readcnt}</td>
					<td>${dto.good}</td><!--추천수  -->
					<td>${dto.bad}</td><!--비추수  -->
				</tr>
			</c:forEach>
		</tbody>
       </table>
       
       <a href="binsertui.do" class="btn btn-primary pull-right" style="width:7%; margin-left:5px;">글쓰기</a>
	
	
	<a href="blist.do" class="btn btn-primary pull-right" style="width:7%; margin-left:5px;">글 목록</a>
    </div>   
		
		<%-- <jsp:include page="b_page.jsp"/> --%>
		
		 <form action = "bsearch.do" method="get" style="diaplay:block ">
			 <select class="one" name="target" style="display:inline-block;with:82px;height:30px;margin-left:800px;">
			
			  <option  value="0">제목</option>
			  <option value="1">내용</option>
			  <option value="2">제목+내용</option>
			  <option value="3">글쓴이</option>
			
			  </select>
			  <input style="height:30px;" type="text" size="20" name="condition"/>
			  <input type="submit" class="btn btn-primary" style="height:33px;" value="검색"/>
			 </form>
	

	
</body>
</html>
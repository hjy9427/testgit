
<%@page import="com.member.MemberDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MList</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"/>
<div class="container">
<h1 style="text-align:center;">회원 목록</h1>
   <table class="table table-striped" style="text-align:center; border:1px solid powderblue;">
   <thead>
   <tr>
   
		<th style="background-color:powderblue; text-align:center; color:black; ">ID</th>
		<th style="background-color:powderblue; text-align:center; color:black;">PW</th>
		<th style="background-color:powderblue; text-align:center; color:black; ">name</th>
		<th style="background-color:powderblue; text-align:center; color:black; ">birth</th>
		<th style="background-color:powderblue; text-align:center; color:black; ">email</th>
	
   </tr>
   </thead>
   <tbody>
   	<c:forEach items="${list}" var="dto">
				<tr>
					<td><a href="mread.do?id=${dto.id}">${dto.name}</a></td>
					
					<!-- 들여쓰기 -->
					<%-- <c:forEach begin="1" end="${dto.repIndent}"> <!-- 원래 글은 들여쓰기가 안되게 1부터 시작 -->
						&nbsp;&nbsp;
					</c:forEach> --%>
					<td>${dto.pw}</td>
					<td>${dto.name}</td>
					<td>${dto.birth}</td>
					<td>${dto.email}</td>
				</tr>
	</c:forEach>
	</tbody>
	
   </table>
   </div>
<jsp:include page="footer.jsp"/>


</body>
</html>
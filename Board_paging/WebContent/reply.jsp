<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>답글 달기</h1>
	<form action="reply.do" method="post">
		<input type="hidden" name="num" value="${num}">
		author:<input name="author" required="required"><br>
		title:<input name="title"required="required"><br>
		content<br>
		<textarea rows="5" name="content" required="required"></textarea>
		<br>
		<input type="submit" value="답글 등록">
	
	
	</form>
	
	
	
	
	
	
</body>
</html>
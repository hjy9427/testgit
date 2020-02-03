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
	<h1>게시글 수정</h1>
	<form action="update.do" method="post">
	
		NUM: <input readonly name="num" value="${dto.num}"><br>
		AUTHOR: <input readonly name="author" value="${dto.author}"><br>
		TITLE: <input name="title" value="${dto.title}"><br>
		CONTENT<br>
		<textarea rows="5" name="content">${dto.content}</textarea>
		<br>
		<input type="submit" value="수정">
	
	</form>
	
	
	
</body>
</html>
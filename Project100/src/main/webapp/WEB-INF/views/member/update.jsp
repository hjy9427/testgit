<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<div class="jumbotron" style="background-color:AliceBlue;">
		<h1 class="container">회원정보 수정</h1>
		</div>
	<form action="/member/update" method="post">
		ID:<input readonly value="${dto.id}" name="id" required="required"><br>
		NAME:<input value="${dto.name}" name="name" required="required"><br>
		AGE:<input value="${dto.age}" name="age" type="number"><br>
		<input type="submit" value="수정">
	
	
	</form>
</body>
</html>
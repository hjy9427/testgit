<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href=" style.css/insert.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"/>

<div class="container">

<h1>회원 탈퇴</h1>
<form action="mdelete.do" method="post">

	<div class="tbox">
	<input placeholder="id" name="id" id="id" value="${id}">
	</div>
    
    <div class="tbox">
	<input placeholder="PW" name="pw" id="pw" type="password">
    </div>
    
	<input class="btn" type="submit" value="탈퇴">
	
</form>
</div>
<jsp:include page="footer.jsp"/>

</body>
</html>
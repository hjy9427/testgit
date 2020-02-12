<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css/login1.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"/>
<div class="container">


<form action="mupdate.do" method="post">


<h1>회원 수정</h1>

	<div class="tbox">
	<input name="id" id="id" value="admin" readonly>
	</div>
	<div class="tbox">
     <input placeholder="name" name="name" id="name" value="admin">
	</div>	
	
    <div class="tbox">
	<input placeholder="birth" name="birth" id="birth" type="date" value="2020-02-05 00:00:00">
	</div>
	
	<div class="tbox">
	<input placeholder="email" name="email" id="email" value="godud5858@google.com">
	</div>
	
	<div class="tbox">
	<input name="pw" id="pw" type="password" value="">
	</div>
	
	<div class="tbox">
	<input placeholder="CheckPW" name="curPW" id="curPW" type="password" >
	</div>
	
	
	<input class="btn" type="submit" value="수정">
	
</form>

</div>



</body>
</html>

<jsp:include page="footer.jsp"/>


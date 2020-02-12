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

<h1>비밀번호 찾기</h1>
<form action="msearchpw.do" method="post">
		아이디: <input name="id" required><br>
		이름: <input name="name" required><br>
		생년월일: <input name="birth" required type="date"><br>
		email: <input name="email" required><br>
	<input type="submit" value="찾기">
</form>

<c:if test="${not empty dto}">
	<p>당신의 비밀번호는 ${dto.pw}입니다</p>
</c:if>

<jsp:include page="footer.jsp"/>

</body>
</html>
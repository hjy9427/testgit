<%@page import="com.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"/>

<h1>Test Home</h1>

<h3>메뉴</h3>


<c:choose>
		<c:when test="${login.id=='admin'}">
	<a href ="mlist.do">회원 목록</a>
	<br>
		</c:when>
		<c:otherwise>
		<br>
		</c:otherwise>
</c:choose>
<a href ="mread.do?id=${login.id}">회원 정보</a>
<br>


<jsp:include page="footer.jsp"/>

</body>
</html>
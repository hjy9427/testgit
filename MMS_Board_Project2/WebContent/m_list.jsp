<%@page import="com.member.MemberDTO"%>

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

	<c:choose>

		<c:when test="${login.id=='admin'}">

	<h1>회원 목록</h1>

	<c:forEach items="${list}" var="dto">
		${dto.id} : <a href="mread.do?id=${dto.id}">${dto.name}</a> <br>
	</c:forEach>

		</c:when>

		<c:otherwise>

			권한이 없습니다
	관리자용 아이디로 로그인하세요

		</c:otherwise>

		

	</c:choose>
	
<jsp:include page="footer.jsp"/>


</body>
</html>
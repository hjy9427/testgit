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
<!--�����ڿ�  -->
	<h1>ȸ�� ���� �� ����</h1>
	ID : ${dto.id}<br>
	PW : ${dto.pw}<br>
	name : ${dto.name}<br>
	birth : ${dto.birth}<br>
	email : ${dto.email}<br>

<a href="mupdateui.do?id=${dto.id}">����</a>

<a href="mdeleteui.do?id=${dto.id}">Ż��</a>

<c:choose>
		<c:when test="${login.id=='admin'}">
	<a href ="mlist.do">ȸ�� ���</a>
	<br>
		</c:when>
		<c:otherwise>
		<br>
		</c:otherwise>
</c:choose>

<jsp:include page="footer.jsp"/>

</body>
</html>
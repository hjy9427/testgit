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
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
i{
height:30px;
}
</style>
</head>
<body>


<div class="container" style="width:90px;margin-left:1200px;display:inline-block;">
<c:choose>
		<c:when test="${not empty login}">
			<a href="bgood.do?num=${dto.num}"><i class="far fa-thumbs-up"></i>&nbsp;${dto.good}</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')"><i class="far fa-thumbs-up"></i>&nbsp;${dto.good}</a>
		</c:otherwise>
</c:choose>
<c:choose>
		<c:when test="${not empty login}">
			<a href="bbad.do?num=${dto.num}"><i class="far fa-thumbs-down"></i>&nbsp;${dto.bad}</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')"><i class="far fa-thumbs-down"></i>&nbsp;${dto.bad}</a>
		</c:otherwise>
</c:choose>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
<%@page import="com.naver.dto.ProductVO"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
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
<jsp:forward page="header.jsp"/>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="new">신상품</a></li>
      <li><a href="top">탑</a></li>
      <li><a href="outer">아우터</a></li>
      <li><a href="pants">팬츠</a></li>
      <li><a href="skirt">스커트</a></li>
      <li><a href="bags">가방</a></li>
      <li><a href="notice">공지사항</a></li>
      <li><a href="event">이벤트</a></li>
      <li><a href="qna">문의하기</a></li>
    </ul>
  </div>
</nav>
	<c:forEach items="${plist}" var="pvo">
		${pvo.pr_thu}
		${pvo.pr_name}
		${pvo.pr_price}	
	</c:forEach>

<jsp:forward page="footer.jsp"/>
</body>
</html>
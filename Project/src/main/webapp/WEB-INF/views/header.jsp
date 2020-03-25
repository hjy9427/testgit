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
	<h1>Shop Name</h1>
	<div class="form-group">
		<a href="index">쇼핑몰이름 홈</a>
		<c:choose>
			<c:when test="${not empty login}">
				<a href="#">회원가입</a>
				<a href="#">로그인</a>
			</c:when>
			<c:otherwise>
				<a href="#">로그아웃</a>
			</c:otherwise>
		</c:choose>
			<a href="#">마이페이지</a>
			<a href="#">장바구니</a>
			<a href="#">위시리스트</a>
			<a href="#">고객센터</a>
		<form action="#" method="post">
			<input name="search" id="search">
			<input type="submit" value="검색">
		</form>
	</div>
	

</body>
</html>
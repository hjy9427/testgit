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
	<h1>회원정보 자세히 보기</h1>
	ID:${dto.id}<br>
	NAME:${dto.name}<br>
	AGE:${dto.age}<br>
	
	<a href="/member/update/${dto.id}">수정</a>|<a href="/member/delete/${dto.id}">삭제</a>|<a href="/member/list">목록</a>
	<!--path value?라고 하는듯? 슬래시 쓰고 디티오아이디쓰는거  -->
</body>
</html>
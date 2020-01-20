<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<%@ include file="header.jsp" %>

=======================<br>

<h1>본문입니다</h1>

=======================<br>

<!-- 액션태그 이용해서 푸터 추가 -->
<jsp:include page="footer.jsp"/>
<hr>
<!--param action tag  -->
<jsp.include page="footer2.jsp">
	<jsp:param value="teacheryo" name="id"/>
	<jsp:param value="이현기" name="name"/>
</jsp.include>
</body>
</html>
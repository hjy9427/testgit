<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="dto" class="com.naver.LoginDTO"/>  
<jsp:setProperty property="id" name="dto" param="id"/>
<!--넘겨받은 데이터사용하니까 파람사용 밸류대신에  -->	
<jsp:setProperty property="age" name="dto" param="pw"/>	  
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
	<jsp:getProperty property="id" name="dto"/>
	:
	<jsp:getProperty property="age" name="dto"/>
</body>
</html>
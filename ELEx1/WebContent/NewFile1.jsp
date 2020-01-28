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
	<%
		int a = 10;
		pageContext.setAttribute("ab", a);	
	%>

	${ab}<br>
	
	<hr>
	
	<% 
		int b = 20;
		pageContext.setAttribute("b", b);
	%>
	<%
		String msg = null;
		pageContext.setAttribute("msg", msg);
	%> 
	${msg}<br><!--암것도 안나옴 널이라서 -->
	${msg.charAt(0)}<br><!--암것도 안나옴 널이라서  -->

	${msg == null}<br><!-- true -->
	${empty msg}<br><!--true, 위에꺼랑 같음  -->
	${not empty msg}<br><!--not null? false  -->






</body>
</html>
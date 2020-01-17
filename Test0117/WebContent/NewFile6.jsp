<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" session ="false" errorPage=""%>
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
	
		/* exception.printStackTrace(); */
		List<Calendar> list = new ArrayList<Calendar>();
	%>
	
	jsp 내장객체
	ㅇexception iserrorpage가 true인 곳에서만 사용 가능
	여긴 false니까 사용불가
	session과 에러페이지 이즈에러페이지만 신경써주면 됨
</body>
</html>
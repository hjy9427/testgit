<%@page import="java.util.ArrayList"%>
<%@page import="com.naver.MemberDTO"%>
<%@page import="java.util.List"%>
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
	<h1>ListCommand</h1>
	<% 
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m001", "kim", 11));
		list.add(new MemberDTO("m002", "lee", 22));
		list.add(new MemberDTO("m003", "lim", 55));
		list.add(new MemberDTO("m004", "kwon", 77));
	%>
	<%
		request.setAttribute("list", list);
	/*바인딩 */
	%>
	<jsp:forward page="d.jsp"/>

	
</body>
</html>
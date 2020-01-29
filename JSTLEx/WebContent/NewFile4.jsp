<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
	<%
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <100; i++){
			list.add(i);		
			}
		request.setAttribute("list", list);
	/* list에 들어있는 모든 요소를 출력하시오 */

	%>
	<c:forEach items="${list}" var="var">
		${var}|
	</c:forEach>
	<c:forEach items="${list}" var="var" begin="4" end="51">
		${var}|
	</c:forEach>
	
	<hr>
	
	<c:forEach varStatus="status" items="${list}" var="var">
		${status.index} : ${status.count} : ${var}<br>
	
	
	</c:forEach>
	
	<hr>
	
	<c:forEach begin="4" end="11" varStatus="status" items="${list}" var="var">
		${status.index} : ${status.count} : ${var}<br>
	
	</c:forEach>
	
	
</body>
</html>
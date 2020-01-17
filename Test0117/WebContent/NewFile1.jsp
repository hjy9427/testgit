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
	<h1>expression tag(표현 태그)</h1>
	<%="hello" %><br>
	hello
	<%
		String msg = "hello";
	%>
	
	<%=msg %>
	
	<%--변수선언해서 출력하기 좋음 위에 첫번쟤 헬로우와 두번째
	헬로우도 잘 출력되는데 이 차이 떄문에 표현태그 사용 --%>
</body>
</html>
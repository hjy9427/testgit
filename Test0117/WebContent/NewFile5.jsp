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
	<h1>real scriptlet tag ����</h1>
	<% 
		int a = 5;
	%>
	<%
		if(a >10){%>
			out.print("<a href = 'https://www.naver.com'>NAVER</a>");
		<%}else{%>
			out.print("<a href = 'https://www.daum.net'>DAUM</a>");
		<%}
	%>out.print ���� html�ڵ�� �������� �ڹ��ڵ�ϱ� �̷��� ����
	  �̷� out.print���������� �ص� �� �Ʒ���ó�� �ᵵ ���� ����
	  �����δ� �Ʒ��� ��ó�� ���ֱ�
	<%
		if(a >10){%>
			<a href = 'https://www.naver.com'>NAVER</a>
		<%}else{%>
			<a href = 'https://www.daum.net'>DAUM</a>
		<%}
	%>
</body>
</html>
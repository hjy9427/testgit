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
	
		pageContext.setAttribute("score", 100);
	
	
	%>




<!--c if�� �ִµ� c else�¾��� c when c choose����ѱ��  -->

	<c:choose>
		<c:when test="${score>=90}">
		A
		</c:when>
		<c:when test="${score>=80}">
		B
		</c:when>
		<c:when test="${score>=70}">
		C
		</c:when>
		<c:when test="${score>=60}">
		D
		</c:when>
		<c:otherwise>
		F
		</c:otherwise>
		
	</c:choose>
	<!--c if�ι� ���°� �ι� �� Ȯ�� c choose������ ���� Ȯ���ϰ�
	������ �׳� ����  -->
</body>
</html>
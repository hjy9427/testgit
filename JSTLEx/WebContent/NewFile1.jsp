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
	/* commandŬ�������� ���ε��Ǿ��ٰ� �����ϱ� */
		request.setAttribute("t1", "test1");
	
	%>
	
	${t1}<br>

	<c:if test="${t1=='test2'}">
		�ȳ��ϼ���
		<h1>�ȳ��ϼ���</h1>
	</c:if>
	<!--test��� �Ӽ��� ������ ���ǽ� �־�޶�� �ǹ�  -->
	
	<c:if test="${t1 !='test2'}">
		1339
		<h1>1339</h1>
		
	</c:if>
	<c:if test="${not empty id}">
		${id}�� ȯ���մϴ�	
	</c:if>
	
	
	
</body>
</html>
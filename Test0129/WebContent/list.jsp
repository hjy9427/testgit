<%@page import="com.naver.MemberDTO"%>
<%@page import="java.util.List"%>
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
	${not empty login ? login.name : ""}
	${not empty login ? " ��, ȯ���մϴ�.<a href='logout.do'>�α� �ƿ�</a>" : "<a href='loginui.do'>�α���</a>"}
	
	<c:if test="${not empty login}">
		${login.name} �� ȯ���մϴ� <a href="logout.do">�α׾ƿ�</a>
	</c:if>
	<c:if test="${empty login}">
		<a href="loginui.do">�α���</a>
	</c:if>
	<!--���� �ΰ� ���� �̿��� ���Ŷ� jstl ����  -->
	
	<c:choose>
		<c:when test="${not empty login}">
		${login.name} �� ȯ���մϴ�<a href="logout.do">�α׾ƿ�</a>
		</c:when>
		<c:otherwise>
		<a href="loginui.do">�α���</a>
		</c:otherwise>
	</c:choose>
	
	
	
	
	<%-- 
	<%
		Object obj = session.getAttribute("login");
		MemberDTO login = null;	
		
		if(obj != null){
			login = (MemberDTO)obj;
			out.print(login.getName());
			out.print(" ��, ȯ���մϴ�.");
			out.print("<a href = 'logout.do'>�α׾ƿ�</a>");
		} else {
			out.print("<a href = 'loginui.do'>�α���</a>");
		}
	
	%>
	--%>
	
	<h1>ȸ�����</h1> 
	<%
		Object obj2 = request.getAttribute("list");
		List<MemberDTO> list = null;
		if(obj2 != null){
			list = (List<MemberDTO>) obj2;
			for(int i = 0; i < list.size(); i++){
				MemberDTO dto = list.get(i);
				out.print(dto.getId());
				out.print(":");
				out.print("<a href= 'read.do?id="+dto.getId()+"'>");
				out.print(dto.getName());
				out.print("</a>");
				out.print("<br>");
			}
		} 
		
	
	
	%>
	
	
	
	
	
	
	
	
	
	
</body>
</html>
<%@page import="com.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<header>  
<a href="index.jsp">Ȩ������</a>
<br>

<c:if test="${login.id=='admin'}">
	<a href ="mlist.do">ȸ�� ���</a>
	<br>
</c:if>

	<a href ="mlist.do">ȸ�� ���</a>
	<br>
	<a href ="minsertui.do">ȸ�� ���</a>
	<br>
	<c:choose>
		<c:when test="${not empty login}">${login.name} ��, ȯ���մϴ�. <a href = 'mlogout.do'>�α׾ƿ�</a></c:when>
		<c:otherwise>�α����� �ϼ���.<a href = 'mloginui.do'>�α���</a></c:otherwise>
	</c:choose>
	
<c:if test="${not empty login}">
<a href="m_mypage.jsp">����������</a>
</c:if>

</header>

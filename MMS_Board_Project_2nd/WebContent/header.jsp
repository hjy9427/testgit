<%@page import="com.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
<link rel="stylesheet" href="css/codingBooster.css">
<link href="https://fonts.googleapis.com/css?family=Nanum+Brush+Script" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
<meta name = "viewport" content="width=device-width initial-scale=1">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<style>
.navbar{
margin:0;
padding:0;


</style>


<nav class="navbar navbar-default" style="height:60px;">
<div class="container-fluid">
<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1"aria-expanded="false">
		           <span class="sr-only"></span>
		           <span class="icon-bar"></span>
		           <span class="icon-bar"></span>
		           <span class="icon-bar"></span>
		       </button>
		       <a class="navbar-brand" href="index.jsp">메인화면</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		   	 <ul class="nav navbar-nav">
         
         <li><c:if test="${login.id=='admin'}">
         <a href="mlist.do">회원목록</a>

         </c:if></li>
  
  
        
	        <li><a href ="minsertui.do">회원 등록</a></li>
           </ul>
	
	<ul class="nav navbar-nav navbar-right">
	 
	<li><c:choose>
		<c:when test="${not empty login}">${login.name} 님, 환영합니다. <a href = 'mlogout.do'>로그아웃</a></c:when>
		<c:otherwise>로그인을 하세요.<a href = 'mloginui.do'>로그인</a></c:otherwise>
	</c:choose></li>
	
	 
	
<c:if test="${not empty login}">
<a href="m_mypage.jsp">마이페이지</a>
</c:if>

</ul>
 </div>

</div>
</nav>

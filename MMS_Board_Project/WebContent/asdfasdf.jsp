<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<c:if test="${id==null }">
<button type="button" id="newLogin">로그인</button>후 사용가능
<span class="rec_count"></span>
</c:if>
<c:if test="${id!=null }">
<button type="button" id="rec_update"></button>
<span class="rec_count"></span>
</c:if>

$(function(){
	$("#rec_update").click(function(){
		$.ajax({
			url:"/RecUpdate.do",
			type:"post",
			data:{
				num:${num.board3 },
				id:'${id }'
			},
			success:function(){
				recCount();
 			},
		})
	})
	
	function recCount(){
	$.ajax({
		url:"/RecCount.do",
		type:"post",
		data:{
			num:${num.board3 }
		},
		syccess:function(count){
		${".rec_count").html(count); 
		},
		})
		};
		recCount();












</body>
</html>
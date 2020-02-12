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
<jsp:include page="header.jsp"/>

<h1>글 자세히 보기</h1>
num: ${dto.num}<br>
제목: ${dto.title}<br>
작성자: ${dto.author}<br>
작성일: ${dto.writeday}<br>
조회수: ${dto.readcnt}<br>
본문<br>
<div>
	${dto.content}
</div>
<br>

	<c:choose>
		<c:when test="${not empty login}">
			<a href="breplyui.do?num=${dto.num}">답글</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')">답글</a>
		</c:otherwise>
	</c:choose>
	
	<c:choose>
		<c:when test="${login.id == dto.author || login.id == 'admin'}">
			<a href="bupdateui.do?num=${dto.num}">수정</a>
		</c:when>
		<c:otherwise>
			<a href="bread.do?num=${dto.num}" onclick="alert('ID가 일치하지 않습니다')">수정</a>
		</c:otherwise>
	</c:choose>
	
	<c:choose>
		<c:when test="${login.id == dto.author || login.id == 'admin'}">
			<a href="bdelete.do?num=${dto.num}">삭제</a>
		</c:when>
		<c:otherwise>
			<a href="bread.do?num=${dto.num}" onclick="alert('ID가 일치하지 않습니다')">삭제</a>
		</c:otherwise>
	</c:choose>
	
	<a href="blist.do?curPage=${curPage}">글 목록</a>

<br>

	<c:choose>
		<c:when test="${not empty login}">
			<button id="goodbutton">좋아요${dto.good}</button>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')">좋아요${dto.good}</a>
		</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${not empty login}">
			<button id="badbutton" >싫어요${dto.bad}</button>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')">싫어요${dto.bad}</a>
		</c:otherwise>
	</c:choose>
	<script type="text/javascript">
	
	$(document).ready(function(){
		var num = ${dto.num}
		$("#goodbutton").click(function(){
			$.ajax({
				url: 'bgood.do',
				type:'get',
				dataType:'text',
				data: {
					
					num : num
				},
				success:function(result) {
					$("#goodbutton").text("좋아요"+result);
				}
			});
			
		});
		
		$("#badbutton").click(function(){
			var num2 = ${dto.num};
			$.ajax({
				url: 'bbad.do',
				type:'get',
				dataType:'text',
				data: {
					
					num : num
				},
				success:function(result) {
					$("#badbutton").text("싫어요"+result);
				}
			});
		
		});
	
	});
	

</script>

	<jsp:include page="footer.jsp" />



</body>
</html>
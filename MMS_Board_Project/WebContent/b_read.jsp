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

<jsp:include page="header.jsp"/>
<a href="binsertui.do">글쓰기</a>
	<h1>글 자세히 보기</h1>
	num : ${dto.num}<br>
	author : ${dto.author}<br>
	writeday : ${dto.writeday}<br>
	readcnt : ${dto.readcnt}<br>
	title : ${dto.title}<br>
	content<br>
	<div>
		${dto.content}
	</div>
	<br>
	<a href="bgood.do?num=${dto.num}&curPage=${curPage}"><button id="goodbutton">Good&nbsp;&nbsp;${dto.good}</button></a>&nbsp;&nbsp;
<a href="bbad.do?num=${dto.num}&curPage=${curPage}"><button id="badbutton">Bad&nbsp;&nbsp;${dto.bad}</button></a><br>


<script type="text/javascript">

	$(document).ready(function() {
		
		$("#goodbutton").click(function() { 
			$.ajax({
	            url   : 'bgood.do',
	           
	            data:{good:"${dto.good}"}
		            type:'post'
			});
		});
		
		$("#badbutton").click(function() { 
			$.ajax({
	            url   : 'bbad.do',
	          
	            data:{bad:"${dto.bad}"}
		            type:'post'
			});
		});
	});
	
</script>



	

	<a href="breplyui.do?num=${dto.num}">답글</a> | <a href="bupdateui.do?num=${dto.num}">수정</a> | <a href="bdelete.do?num=${dto.num}">삭제</a> | <a href="blist.do">전체 목록</a> | <a href="blist.do?curPage=${curPage}">직전 목록</a>
	

</body>
</html>
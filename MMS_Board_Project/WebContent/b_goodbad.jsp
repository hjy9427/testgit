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



<a href="bgood.do?num=${dto.num}&curPage=${to.curPage}"><button id="goodbutton">Good&nbsp;&nbsp;${dto.good}</button></a>&nbsp;&nbsp;
<a href="bbad.do?num=${dto.num}&curPage=${to.curPage}"><button id="badbutton">Bad&nbsp;&nbsp;${dto.bad}</button></a><br>


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













<jsp:include page="footer.jsp"/>
</body>
</html>
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

<h1>ȸ�� ���</h1>

<form action="minsert.do" method="post">

	<label for="id">ID: </label>
	<input name="id" id="id" required>
	<button>�ߺ�üũ</button>
		<p></p>
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password">
	<br>
	<label for="name">NAME: </label>
	<input name="name" id="name" required>	
	<br>
	<label for="birth">BIRTH: </label>
	<input name="birth" id="birth">��:1999/01/19
	<br>	
	<label for="email">EMAIL: </label>
	<input name="email" id="email">
	<br>
	<input type="submit" value="���">
	
</form>

<script type="text/javascript">

	$(document).ready(function() {
		
		$("button").click(function() { 
			var id = $("input[name='id']").val(); 
			
			$.ajax({
	            type:'get',
	            url   : 'checkid.do',
	            data: {
	               id : id
	            },
	            dataType:'text',
	            success: function(result){
	               $("p").text(result);
	            }
			});
		});
	});
	
</script>

<jsp:include page="footer.jsp"/>

</body>
</html>
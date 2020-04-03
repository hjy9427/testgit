<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<div class="jumbotron" style="background-color:AliceBlue;">
		<h1 class="container">비밀번호 변경</h1>
	</div>
	
	<form action="searchpwa" method="post">
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password" required>
	<label for="pw2">PW 확인: </label>
	<input name="pw2" id="pw2" type="password" required>
	<input type="hidden" name="id" id="id" value="${mdto.id}">
	<input type="submit">
	</form>
	<p id="ppw"></p>
	<script type="text/javascript">

	$(document).ready(function() {
		var chkpw = null;
		
		$('#pw').keyup(function(){
			if($('#pw').val() != $('#pw2').val()){
				$('#ppw').html('비밀번호가 일치하지 않습니다. 다시 입력하세요');
				chkpw = null;
			} else{
				$('#ppw').html('비밀번호 일치함.');
				chkpw = '1';
			}	
		});
		
 		$('#pw2').keyup(function(){	
			if($('#pw').val() != $('#pw2').val()){
				$('#ppw').html('비밀번호가 일치하지 않습니다. 다시 입력하세요');
				chkpw = null;
			} else{
				$('#ppw').html('비밀번호 일치함.');
				chkpw = '1';
			}	
		});
 		
 		$("#submit").click(function(){
 			
 			if(chkpw == '1') {
 				return true;
 			} else if(chkpw == null) {
 				alert("비밀번호를 확인하세요.");
 				return false;
 			} 
 			
 		});
 	
 		
	});
	</script>
	
</body>
</html>
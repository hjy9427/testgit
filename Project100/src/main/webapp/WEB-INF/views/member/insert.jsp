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
		<h1 class="container">회원가입</h1>
	</div>
	<div class="container">
	
	
	<form action="insert" method="post">

	<label for="id">ID: </label>
	<input name="id" id="id" required>
	<button id="chkidbt">중복체크</button>
		<p id="chkid"></p>
	<label for="name">이름: </label>
	<input name="name" id="name" required>	
	<br>
	
	<label for="age">나이: </label>
	<input name="age" id="age" type="number">
	<br>
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password" required>
	<label for="pw2">PW 확인: </label>
	<input name="pw2" id="pw2" type="password" required>
	<p id="chkpw"></p>
	<input type="submit" name="submit" id="submit" value="등록">
	
</form>
</div>
<script type="text/javascript">

	$(document).ready(function() {
		var chksubmitid = null;
		var chksubmitpw = null;
		
		$("#chkidbt").click(function() { 
			var id = $("input[id='id']").val(); 
			
			$.ajax({
	            type:"get",
	            url   : "/member/checkid",
	            data: {
	               id : id
	            },
	            dataType:"text",
	            success: function(result){
	            	
	            	if(result =="0") {
		            	   $("#chkid").text("사용 불가능한 아이디입니다.");
		            	   chksubmitid = null;
		               }else{
		            	   $("#chkid").text("사용 가능한 아이디 입니다.");
		            	   chksubmitid = '1';
		               } 
	            }
			});
		});
		
		$('#pw').keyup(function(){
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('비밀번호가 일치하지 않습니다. 다시 입력하세요');
				chksubmitpw = null;
			} else{
				$('#chkpw').html('비밀번호 일치함.');
				chksubmitpw = '1';
			}	
		});
		
 		$('#pw2').keyup(function(){	
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('비밀번호가 일치하지 않습니다. 다시 입력하세요');
				chksubmitpw = null;
			} else{
				$('#chkpw').html('비밀번호 일치함.');
				chksubmitpw = '1';
			}	
		});
 		
 		$("#submit").click(function(){
 			
 			if(chksubmitid == '1' && chksubmitpw == '1') {
 				return true;
 			} else if(chksubmitpw == null) {
 				alert("비밀번호를 확인하세요.");
 				return false;
 			} else {
 				alert("ID 중복체크를 하세요.");
 				return false;
 				}
 			
 		});
 	
 		
	});
	
	
</script>
	
</body>
</html>
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
  <link rel="stylesheet" href="style.css/insert.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  .one{
  display:inline-block
  }
  </style>
</head>
<body>

<jsp:include page="header.jsp"/>
<div class="container">
<h1>회원 가입</h1>

<form action="minsert.do" method="post">

	<div class="tbox">
	<input  placeholder="ID" type="text" name="id" id="id" required>
	</div>
	
	<div class="tbox">
	<input placeholder="Password" type="password" name="pw" id="pw" type="password" required>
	</div>
	<div class="tbox">
	<input placeholder="CheckPW" name="pw2" id="pw2" type="password" required>
	</div>
	<p id="chkpw"></p>
	
	<div class="tbox">
	<input placeholder="name" type="text" name="name" id="name" required>	
    </div>
	
	<div class="tbox">
	<input placeholder="생년월일" style="text-align:center;" name="birth" id="birth" type="date" required="required">
	</div>
	
	<div class="tbox">
	<input placeholder="email" type="text" name="email" id="email" required="required">
    </div>
	
	
	<input class="btn" type="submit" name="submit" id="submit" value="회원가입"><br>
	<button class="btn" style="width:90px; height:30px;" id="chkidbt" style="color:black">ID중복체크</button><br><br>
		<p id="chkid"></p>
		
	
</form>
</div>
<script type="text/javascript">

	$(document).ready(function() {
		var chksubmitid = '0';
		var chksubmitpw = '0';
		
		$("#chkidbt").click(function() { 
			var ida = $("input[name='id']").val(); 
			
			$.ajax({
	            type:'get',
	            url   : 'mcheckid.do',
	            data: {
	               id : ida
	            },
	            dataType:'text',
	            success: function(result){
	               if(result =="0") {
	            	   $("#chkid").text("사용 불가능한 아이디입니다. 다시 입력하세요.");
	            	   chksubmitid = '0';
	               }else{
	            	   $("#chkid").text("사용 가능한 아이디 입니다.")
	            	   chksubmitid = '1';
	               }
	            }
			});
		return false;
		});
		
		$('#pw').keyup(function(){
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('비밀번호가 일치하지 않습니다. 다시 입력하세요');
				chksubmitpw = '0';
			} else{
				$('#chkpw').html('비밀번호 일치함.');
				chksubmitpw = '1';
			}	
		});
		
 		$('#pw2').keyup(function(){	
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('비밀번호가 일치하지 않습니다. 다시 입력하세요');
				chksubmitpw = '0';
			} else{
				$('#chkpw').html('비밀번호 일치함.');
				chksubmitpw = '1';
			}	
		});
 		
 		$("#submit").click(function(){
 			
 			if(chksubmitid == '1' && chksubmitpw == '1') {
 				return true;
 			} else if(chksubmitpw == '0') {
 				alert("비밀번호를 확인하세요.");
 				return false;
 			} else {
 				alert("ID 중복체크를 하세요.");
 				return false;
 				}
 			
 		});
 	
 		
	});
	
/* 	$(function(){
		$('#pw').keyup(function(){
			$('#chkpw').html('');
		});
		
 		$('#pw2').keyup(function(){	
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('비밀번호가 일치하지 않습니다. 다시 입려하세요');
			} else{
				$('#chkpw').html('비밀번호 일치함.')
			}	
		});
	}); */
	
</script>



<jsp:include page="footer.jsp"/>

</body>
</html>
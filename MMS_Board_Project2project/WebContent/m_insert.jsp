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
	<button id="chkidbt">�ߺ�üũ</button>
		<p id="chkid"></p>
		
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password" required>
	<label for="pw2">PW Ȯ��: </label>
	<input name="pw2" id="pw2" type="password" required>
	<p id="chkpw"></p>
	
	<label for="name">�̸�: </label>
	<input name="name" id="name" required>	
	<br>
	
	<label for="birth">�������: </label>
	<input name="birth" id="birth" type="date">
	<br>
	
	<label for="email">E-mail: </label>
	<input name="email" id="email">
	<br>
	
	
	<input type="submit" name="submit" id="submit" value="���">
	
</form>

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
	            	   $("#chkid").text("��� �Ұ����� ���̵��Դϴ�. �ٽ� �Է��ϼ���.");
	            	   chksubmitid = '0';
	               }else{
	            	   $("#chkid").text("��� ������ ���̵� �Դϴ�.")
	            	   chksubmitid = '1';
	               }
	            }
			});
		return false;
		});
		
		$('#pw').keyup(function(){
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���');
				chksubmitpw = '0';
			} else{
				$('#chkpw').html('��й�ȣ ��ġ��.');
				chksubmitpw = '1';
			}	
		});
		
 		$('#pw2').keyup(function(){	
			if($('#pw').val() != $('#pw2').val()){
				$('#chkpw').html('��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���');
				chksubmitpw = '0';
			} else{
				$('#chkpw').html('��й�ȣ ��ġ��.');
				chksubmitpw = '1';
			}	
		});
 		
 		$("#submit").click(function(){
 			
 			if(chksubmitid == '1' && chksubmitpw == '1') {
 				return true;
 			} else if(chksubmitpw == '0') {
 				alert("��й�ȣ�� Ȯ���ϼ���.");
 				return false;
 			} else {
 				alert("ID �ߺ�üũ�� �ϼ���.");
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
				$('#chkpw').html('��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���');
			} else{
				$('#chkpw').html('��й�ȣ ��ġ��.')
			}	
		});
	}); */
	
</script>



<jsp:include page="footer.jsp"/>

</body>
</html>
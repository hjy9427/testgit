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
		<h1 class="container">아이디 찾기</h1>
	</div>
	<div class="container">
			이름 : <input name="name" id="name">
			나이 : <input name="age" id="age" type="number">
			<input type="submit" value="submit" name="submit" id="submit">
		<p id="knowid"></p>
		
	</div>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#submit").click(function(){
			var name= $("#name").val();
			var age=$("#age").val();
			$.ajax({
				type: 'get',
				url: "/member/searchida",
				data: {
					name:name,
					age:age
				},
				dataType: 'text',
				success: function(result){
		 			if(result=="a"){
						$("#knowid").text("아이디가 존재하지 않습니다.");
					}else{
						$("#knowid").text(result+"입니다");
					} 
				}
			});
		});
		
	}); 
	
	
	
	</script>
</body>
</html>
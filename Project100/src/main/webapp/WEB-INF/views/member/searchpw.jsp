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
		<h1 class="container">비밀번호 찾기</h1>
	</div>
	<div class="container">
	<form action="searchpwa", method="get">
			아이디: <input name="id", id="id">
			이름 : <input name="name" id="name">
			나이 : <input name="age" id="age" type="number">
			<input type="submit" value="submit" name="submit" id="submit">
		</form>
		
	</div>
	
</body>
</html>
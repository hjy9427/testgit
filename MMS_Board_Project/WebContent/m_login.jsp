<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<h1>�α���</h1>
<form action="mlogin.do" method="post">

	<label for="id" >ID: </label> 
	<input name="id" id="id" required>
	<br>
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password" required>
	<br>
	<input type="submit" value="�α���">
	
</form>

</body>
</html>
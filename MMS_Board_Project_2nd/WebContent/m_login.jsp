<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->
 <!--  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->
  <link rel="stylesheet" href="style.css/login1.css">
</head>
<style>

</style>

<jsp:include page="header.jsp"></jsp:include>

<body>


<div class="container">
  <h1>LOG IN</h1>
  <form  action="mlogin.do" method="post">
    <div class="tbox">
      <input required="required" type="text" placeholder="ID" id="id" name="id" value="">
    </div>

    <div class="tbox">
    <input required="required" type="password" placeholder="password" name="pw" id="id" value="">
    </div>

    <input class="btn" type="submit"  value="로그인">
  </form>
   
  <a class="b1" href="m_searchResult.jsp">아이디 찾기</a><br>
  <a class="b2" href="m_insert.jsp" >회원가입</a> 
</div>




<!-- <div class="container">
<h1>로그인</h1>
<form action="mlogin.do" method="post">

	<label for="id" >ID: </label> 
	<input name="id" id="id" required>
	<br>
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password" required>
	<br>
	<input type="submit" value="로그인">
	
</form>
</div> -->


</body>
</html>
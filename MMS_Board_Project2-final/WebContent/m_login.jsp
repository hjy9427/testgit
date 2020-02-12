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

<jsp:include page="header.jsp"/>

<h1>로그인</h1>
<form action="index.jsp" method="post">

	<label for="id" >ID: </label> 
	<input name="id" id="id" required>
	<br>
	<label for="pw">PW: </label>
	<input name="pw" id="pw" type="password" required>
	<br>
	<input type="submit" id="submit" name="submit" value="로그인">
	
</form>

<a href = "msearchidui.do">아이디 찾기</a>
<br>
<a href = "msearchpwui.do">비밀번호 찾기</a>

    <script type="text/javascript">
      $(document).ready(function() {
    	  
         $("#submit").click(function() {
            var id1 = $("input[name='id']").val();
            var pw1 = $("input[name='pw']").val();
            $.ajax({
               type : 'post',
               url : 'mlogin.do',
               data : {
                  id : id1,
                  pw : pw1
               },
               dataType : 'text',
               success : function(result) {
                  if (result == "1") {
                      window.alert("아이디 비밀번호를 확인 해주세요.");
                      return false;
                 } 
                  
               }
            });
           
         });
      });
   </script> 

<jsp:include page="footer.jsp"/>

</body>
</html>
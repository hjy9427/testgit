<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<br>
<br>

    <div class="container">
    <div class="row">
	<form action="binsert.do" method="post">
	<table class="table table-striped" style="text-align:center; border:1px solid powderblue ;width:700px; margin-left:200px;border-radius: 5px;">
	<thead>
	<tr>
    <th colspan="2" style="background-color:powderblue; text-align:center; color:black;font-size:25px;border-radius: 5px;">글쓰기</th>
     </tr>
    </thead>
    <tbody>
       <tr>
		<td> <input name="author" id="author" value="${login.id}" readonly class="form-control" style="font-size:25px;"><td>
		</tr>
		<tr>
		<td> <input required="required" type="text" class="form-control" placeholder="글 제목" maxlength="50" style="font-size:25px;" name="title" ><td>
		</tr>
		<tr>
		<td><textarea required="required" rows="5" class="form-control" placeholder="글내용" maxlength="2048" style="height:400px; width:700px; font-size:20px;" name="content"></textarea><td>
	    </tr>
		</tbody>
		</table>
		<input type="submit" class="btn btn-primary" style="width:6%; margin-left:850px" value="등록">
	</form>
	</div>
   </div>
</body>
</html>
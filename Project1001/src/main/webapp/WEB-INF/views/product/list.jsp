<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="/resources/js/board.js" type="text/javascript"></script>
<style type="text/css">
ul {
  list-style-type: none;
  margin: 0;
  padding: 30px;
  overflow: hidden;
}

li {
	float: left;
	padding:30px;
}
li a {
  display: block;
  text-align: center;
  text-decoration: none;
  padding:30px;
}
</style>
</head>
<body>
	<div class="jumbotron" style="background-color: AliceBlue;">
		<h1 class="container">물품 목록</h1>
	</div>
	<div class="container">
		<div class="row">
			<ul id="prolist">
			<c:forEach items="${plist}" var="pdto">
					<li><a href="/product/read?${pdto.pno}">
						${pdto.title}<br>  
						가격${pdto.price}
					</a></li>
			</c:forEach>
			</ul>
		</div>


	</div>
	
</body>
</html>
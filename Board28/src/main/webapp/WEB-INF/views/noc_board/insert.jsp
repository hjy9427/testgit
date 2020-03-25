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
		.fileDrop{
			width:100%;
			height:200px;
			border:1px solid green;
			background-color:lightslategray;
			margin:auto;
		}
		.uploadedList{
			list-style:none;
		}
		.uploadedList li{
			margin-top:20px;
		}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
		<div class="jumbotron">
		<h1>글쓰기</h1>
		</div>
		
			<form method="post">
				<div class="form-group">
					<label for="title">제목</label>
					<input class="form-control" name="noc_title" id="noc_title">
				</div>
				
				<div class="form-group">
					<label for="writer">작성자</label><%-- value="${login.id}" --%>
					<input class="form-control" name="noc_writer" id="noc_writer">
				</div>
				<div class="form-group">
					<label for="content">내용</label>
					<textarea class="form-control" rows="5" name="noc_content" id="noc_content"></textarea>
				</div>
			</form>

			<div class="form-group">
				<button class="btn btn-primary" type="submit">등록</button>
				<button class="btn btn-warning" type="reset">초기화</button>
			</div>
		</div>
	</div>
</body>
</html>
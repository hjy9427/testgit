<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			border:1px solid black;
			background-color:lightgray;
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
	<div class="jumbotron" style="background-color: AliceBlue;">
		<h1 class="container">물품 등록</h1>
	</div>
	<div class="container">


		<form action="insert" method="post">

			<div class="form-group">
				<label for="title">제목</label> <input class="form-control"
					name="title" id="title">

			</div>

			<div class="form-group">
				<label for="writer">작성자</label> 
				<input readonly value="${login.id}" class="form-control" name="writer" id="writer">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="content" id="content"></textarea>
			</div>
			<div class="form-group">
				<label for="price">가격</label> 
				<input class="form-control" name="price" id="price" type="number">
			</div>
			<div class="form-group">
				<label for="foption">옵션1</label> 
				<input class="form-control" name="foption" id="foption">
			</div>
			<div class="form-group">
				<label for="soption">옵션2</label> 
				<input class="form-control" name="soption" id="soption">
			</div>
			<div class="form-group">
				<label for="toption">옵션3</label> 
				<input class="form-control" name="toption" id="toption">
			</div>
			</form>
			<div class="form-group">
			<!--form-control 한 줄 form- group 묶어주는거  -->
				<label>업로드할 파일을 드랍시키세요</label>
				<div class="fileDrop"></div>
			</div>
			<ul class="uploadedList clearfix">
		
			</ul>
						
			<div class="form-group">
				<button class="btn btn-primary" type="submit">등록</button>
				<button class="btn btn-warning" type="reset">초기화</button>
			</div>
		</div>
	</div>

<script type="text/javascript">
	$(document).ready(function() {
		$(".uploadedList").on("click", ".delbtn", function(event){
			event.preventDefault();
			
			var that=$(this);
			var filename=that.attr("href");
			
			$.ajax({
				type:"post",
				url:"/deletefile",
				data: {
					filename:filename
				},
				dataType:"text",
				success: function(data){
					that.parent("div").parent("li").remove();
				}
			});
			
		});
		
			
			$(".fileDrop").on("dragenter dragover", function(event){
				event.preventDefault();
			});
			
			$(".fileDrop").on("drop", function(event){
				event.preventDefault();
				var arr=event.originalEvent.dataTransfer.files;
				
	
				var file=arr[0];
				var formData=new FormData();
		
				formData.append("file", file);
				
				$.ajax({
					type:"post",
					url:"/uploadajaxprod",
					data: formData,
					dataType:"text",
					processData:false,
					contentType:false,
					success: function(data){
						iconAppend(data, true);
					
					}
						
			});
		}); 
		
		
		
		$("button[type='submit']").click(function(event){
		
			event.preventDefault();
				var msg="";
				
				$(".delbtn").each(function(index){
				var filename =$(this).attr("href");
				msg+="<input name='filename["+index+"]' value='"+filename+"' type='hidden'>"
			});
				$("form").append(msg);
				$("form").submit();
		
		});
		$("button[type='reset']").click(function(){
			location.href = "/product/listpage";
		});
		
	}); 
	
	
	
</script>
</body>
</html>
<%@page import="com.naver.dto.ProductDTO"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
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
	.uploadedList{
		list-style:none;
	}
	.board_img_icon{
		cursor:pointer;/* 클릭대상임을 보여줌 커서 손가락표시 */
	}	
	.half{
		position:absolute;
		right:55px;
		width:40%
	}
	</style>

</head>
<body>
<div class="jumbotron" style="background-color:AliceBlue;">
		<h1 class="container">물품 상세 보기</h1>
		</div>
	 <div class="container">
		<div class="row">
			<div class="form-group">
				<label for="title">제목</label>
				<input class="form-control" id="title" readonly value="${pdto.title}" name="title">
			</div><br>
			<div class="form-group">
 				<ul class="uploadedList thumbnail">
					<%
						ProductDTO pdto=(ProductDTO)request.getAttribute("pdto");
						String[] arr= pdto.getFilename();
						ObjectMapper mapper=new ObjectMapper();
						String filenames=mapper.writeValueAsString(arr);
						pageContext.setAttribute("filenames", filenames);
					%>
				</ul>
			</div> 
			<div class="form-group half">
				<label for="price">가격</label>
				<input class="form-control" id="title" readonly value="${pdto.price}" name="price">
			</div><br><br>

			<div class="form-group">
				<label for="content">내용</label>
				<textarea name="content" readonly id="content" rows="5" class="form-control">${pdto.content}</textarea>
				<!--textarea에서 줄바꿈하면 indent됨 줄바꿈하지 말것  -->
			</div>
			
			
		</div><!--class=row  -->
		<div class="row">
			<form>
				<input type="hidden" name="pno" value="${pdto.pno}">
				<input type="hidden" name="curPage" value="${curPage}">
			</form>
			
		</div><!--class row  -->
	
				<button class="btn btn-success">수정</button>
				<button class="btn btn-danger">삭제</button>
				<button class="btn btn-primary">목록</button>
		
	</div><!--class=container  -->
 	<script type="text/javascript">
	var pno=${pdto.pno};
		$(document).ready(function(){
			var arr=${filenames};
			for(var i=0;i<arr.length;i++){
				var filename=arr[i];
				iconAppend(filename, false);
			}
			$(".uploadedList").on("click", ".board_img_icon", function(){
				var filename=$(this).attr("data-url");
				
				if(checkImg(filename)){
					filename=getImageName(filename);
				}
				location.assign("/display?filename="+filename);
				
			});
			$(".btn-primary").click(function(){
				location.assign("/product/listpage?curPage=${curPage}");
		
			});
			$(".btn-success").click(function(){
				$("form").attr("method", "get");
				$("form").attr("action", "/product/update");
				$("form").submit();
			});
			
			$(".btn-danger").click(function(){
				$("form").attr("method", "post");
				$("form").attr("action", "/product/delete/${pdto.pno}/${curPage}");
				
				
				$("form").submit();
			});
			
		
		
		});


	</script> 

</body>
</html>
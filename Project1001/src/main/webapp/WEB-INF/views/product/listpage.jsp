<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.naver.dto.ProductDTO"%>
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
.thumbnail{
height:270px;
width: 175px;

}
</style>
</head>
<body>
	<div class="jumbotron" style="background-color: AliceBlue;">
		<h1 class="container">물품 목록</h1>
	</div>
		<form>
				<input type="hidden" name="curPage" value="${curPage}">
			</form>
	<div class="container">
		<div class="row">
			<ul>
			
			<c:forEach items="${to.plist}" var="pdto">
			<li id="${pdto.pno}">
					<a href="/product/read/${pdto.pno}?curPage=${to.curPage}">
					<ul class="uploadedList thumbnail clearfix">
					<%
						ProductDTO pdto=(ProductDTO)request.getAttribute("pdto");
					    if(pdto!=null){
					    	String[] arr= pdto.getFilename();
							ObjectMapper mapper=new ObjectMapper();
							String filenames=mapper.writeValueAsString(arr);
							pageContext.setAttribute("filenames", filenames);
					    }
						
					%> 
					</ul>
				<br>
						${pdto.title}<br>  
						가격${pdto.price}
					</a></li>
				</c:forEach>
			</ul>
			</div>

<div class="row">
			<div class="text-center">
				<ul class="pagination">
					<c:forEach var="var" end="${to.stopPageNum}" begin="${to.beginPageNum}">
						<li class="${to.curPage==var?'active':''}"><a href="/product/listpage?curPage=${var}">${var}</a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="form-group">
				<div class="row">
					<a href="/product/insert">물품 등록</a>
				</div>
			</div><div class="form-group">
				<div class="row">
					<a href="/user/login">로그인</a>
				</div>
			</div>
			</div>
		</div>
		
			

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

		});
		</script> 

</body>
</html>
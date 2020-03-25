<%@page import="com.naver.dto.QNABoardVO"%>
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
	</style>

</head>
<body>
	<div class="container">
		<div class="row">
			<h1>글 자세히 보기</h1>
			<div class="form-group">
				<label for="title">제목</label>
				<input class="form-control" id="title" readonly value="${vo.title}" name="title">
			</div>
			<div class="form-group">
				<label for="writer">작성자</label>
				<input class="form-control" id="writer" readonly value="${vo.writer}" name="writer">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea name="content" readonly id="content" rows="5" class="form-control">${vo.content}</textarea>
				<!--textarea에서 줄바꿈하면 indent됨 줄바꿈하지 말것  -->
			</div>
			
			<div class="form-group">
				<label>첨부파일</label>
				<ul class="uploadedList clearfix">
					<%
					QNABoardVO vo=(QNABoardVO)request.getAttribute("vo");
									String[] arr= vo.getFilename();
									ObjectMapper mapper=new ObjectMapper();
									String filenames=mapper.writeValueAsString(arr);
									pageContext.setAttribute("filenames", filenames);
					%>
				</ul>
			</div>
		</div><!--class=row  -->
		<div class="row">
			<form>
				<input type="hidden" name="bno" value="${vo.bno}">
				<input type="hidden" name="curPage" value="${curPage}"> 
				<input type="hidden" name="reproot" value="${vo.reproot}">
				<input type="hidden" name="repstep" value="${vo.repstep}">
				<input type="hidden" name="repindent" value="${vo.repindent}">
				
			</form>
			<div class="form-group">
				
				<c:if test="${vo.writer==login.id}">
				<button class="btn btn-success">수정</button>
				<button class="btn btn-danger">삭제</button>
				<button class="btn btn-default" >답글</button>
				</c:if>
				
				<button class="btn btn-primary">목록</button>
			</div>
		</div><!--class row  -->
		
		
		
	</div><!--class=container  -->
	<script type="text/javascript">
	var bno=${vo.bno};
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
			
			
			
			/*목록누르면 게시판 목록으로 가기  */
			$(".btn-primary").click(function(){
				location.assign("/qboard/listpage?curPage=${curPage}");

			});
			$(".btn-success").click(function(){
				$("form").attr("method", "get");
				$("form").attr("action", "/qboard/update");
				$("form").submit();
			});
			
			$(".btn-default").click(function(){
				$("form").attr("method", "get");
				$("form").attr("action", "/qboard/rep");
				$("form").submit();
			});
			$(".btn-danger").click(function(){
				$("form").attr("method", "post");
				$("form").attr("action", "/qboard/delete/${vo.bno}/${curPage}");
				$("form").submit();
			});
			
		
		});
		
	

	</script>

</body>
</html>
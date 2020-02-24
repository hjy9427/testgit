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
		</div><!--class=row  -->
		<div class="row">
			<form>
				<input type="hidden" name="bno" value="${vo.bno}">
				<input type="hidden" name="curPage" value="${curPage}">
				<%-- value="${param.curPage}"도 되긴한데 --%>
				<!--param은 되도록이면 쓰지 말기  -->
			</form>
			<div class="form-group">
				<button class="btn btn-info">댓글</button>
				<button class="btn btn-success">수정</button>
				<button class="btn btn-danger">삭제</button>
				<button class="btn btn-primary">목록</button>
			</div>
		</div>
	</div><!--class=container  -->
	<script type="text/javascript">
		$(document).ready(function(){
			/*목록누르면 게시판 목록으로 가기  */
			$(".btn-primary").click(function(){
				location.assign("/board/listpage?curPage=${curPage}");
				/* $("form").attr("method", "get");
				$("form").attr("action", "/board/listpage");
				$("form").submit(); */
				/* location.assign("/board/list"); 
				location.href = "/board/list"; 
				이 세 개 같음
				href는 안되는 경우도 있어서 어사인 쓰는게 나음
				form 태그 이용한건 주소창에 http://localhost:8089/board/list?bno=10
						이렇게 나옴*/
			});
			$(".btn-success").click(function(){
				$("form").attr("method", "get");
				$("form").attr("action", "/board/update");
				$("form").submit();
			});
		});
		
	</script>

</body>
</html>
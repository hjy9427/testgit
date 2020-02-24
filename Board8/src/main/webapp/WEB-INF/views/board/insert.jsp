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
		<div class="jumbotron">
		<h1>글쓰기</h1>
		</div>
		
			<form method="post">
				<!--첨부파일작업을 위해 액션 제거  -->
				<div class="for-group">
					<label for="title">제목</label>
					<input class="form-control" name="title" id="title">
				<!--폼 컨트롤 빈 칸 한 줄 생김 
				레이블과 묶어주기 위해 레이블에는 포 타이틀 쓰고
				인풋태그 안에 아이디 타이틀로 작성  -->
				</div>
				
				<div class="form-group">
					<label for="writer">작성자</label>
					<input class="form-control" name="writer" id="writer">
				</div>
				<div class="form-group">
					<label for="content">내용</label>
					<textarea class="form-control" rows="5" name="content" id="content"></textarea>
				</div>
			</form>
			
			<div class="form-group">
				<button class="btn btn-primary" type="submit">등록</button>
				<button class="btn btn-warning" type="reset">초기화</button>
			</div>
		</div>
	</div>

<script type="text/javascript">
	$(document).ready(function() {
		$("button[type='submit']").click(function(){
			/* $("button")
			$(".btn")
			$("#btn") 세가지방법 
			위에껀 타입이 서브밋인 버튼찾기
			클래스 비티엔프라이머리 써도 되는데 나중에 겹치는 애 생길 수 있어서 저걸로씀
			*/
			/* .click(function(){}); 클릭하면 중괄호 안을 실행시켜라  
			이벤트가 클릭 실행문구가 이벤트핸들러*/
				/* $("form").attr("method", "post");
				$("form").attr("action", "/board/insert"); 
				폼태그 위에꺼 이런식으로도 작성 가능
				*/
				$("form").submit();
				/* 폼태그 여러개 있으면 배열되서 순서 정해줘야함 
				서브밋은 제출*/
		});
		
		
	});
	/* $(document).ready(function() {
	}); 
	이게 제이쿼리 사용준비문구
	취소버튼누르면 리스트로 등록 누르면 등록되기
	*/
	$(document).ready(function() {
		$("button[type='reset']").click(function(){
			location.href = "/board/list";
		});
	});





</script>
</body>
</html>
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
<div class="jumbotron" style="background-color:AliceBlue;">
		<h1 class="container">게시판</h1>
		</div>
	<div class="container">
	<!--컨테이너는 좌측과 우측에 빈 공간을 줌 꽉 채우고싶으면 컨테인드어쩌고???  -->
		<form>
				
				<input type="hidden" name="curPage" value="${curPage}">
				
			</form>
		
		<div class="row">
	
		<!--디브 기능 하나  -->
			<table class="table">
				<thead>
					<tr>
						<th>bno</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${to.list}" var="vo">
						<tr>
							<td>${vo.bno}</td>
							<td><a href="/board/read/${vo.bno}?curPage=${to.curPage}">${vo.title}</td>
							<td>${vo.writer}</td>
							<td>${vo.updatedate}</td>
							<td>${vo.readcnt}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div><!-- class=row  -->
		<div class="row">
			<div class="text-center"><!--가운데정렬  -->
				<ul class="pagination">
					<c:forEach var="var" end="${to.stopPageNum}" begin="${to.beginPageNum}">
						<li class="${to.curPage==var?'active':''}"><a href="/board/listpage?curPage=${var}">${var}</a></li>
					</c:forEach>
				</ul><!--unordered list  -->
			</div>
		</div>
		
		<div class="row">
			<a href="/board/insert">글쓰기</a>
		</div><!--class=row  -->
		<div class="row">
			<a href="/qboard/listpage">QNA게시판</a>
		</div>
		<div class="row">
			<a href="/member/insert">회원가입</a>
		</div>
		<div class="row">
			<a href="/user/login">로그인</a>
		</div>
		<div class="row">
			<a href="/member/list">회원목록</a>
		</div>
		<div class="row">
			<a href="/product/insert">물품 등록</a>
		</div>
		<div class="row">
			<a href="/product/listpage">물품 목록</a>
		</div>
	</div><!-- class= conatainer  -->
	
	
</body>
</html>
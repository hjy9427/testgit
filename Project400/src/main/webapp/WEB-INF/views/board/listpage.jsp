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
	<!--컨테이너는 좌측과 우측에 빈 공간을 줌 꽉 채우고싶으면 컨테인드어쩌고???  -->
		<form>
				
				<input type="hidden" name="curPage" value="${curPage}">
				
			</form>
		
		<div class="row">
		
		<!--디브 기능 하나  -->
			<table class="table">
			<!--부트스트랩은 클래스기반이라 클래스이름을 적어줘야 됨  -->
				<thead>
				<!--컬럼명적기  -->
					<tr>
						<th>bno</th>
						<th>문의유형</th>
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
							<c:choose>
								<c:when test="${vo.qnatype=='a'}">
									<td>홈페이지 문의</td>
								</c:when>
								<c:when test="${vo.qnatype=='b'}">
									<td>상품문의</td>
								</c:when>
								<c:when test="${vo.qnatype=='c'}">
									<td>배송문의</td>
								</c:when>
								<c:otherwise>
									<td>기타</td>
								</c:otherwise>
							</c:choose>
							
							<c:choose>
								<c:when test="${vo.secretno==1}">
									<c:choose>
									<c:when test="${login.id!=null}">
										<c:choose>
											<c:when test="${login.id==vo.writer}"> 
												<td><a href="/board/read/${vo.bno}?curPage=${to.curPage}">${vo.title}</td>
											</c:when>
											<c:otherwise>
												<td><a class="secretqna" href="redirect:/board/listpage?curPage=${curPage}">${vo.title}</button></td>
											</c:otherwise>
									<%--   --%>
										</c:choose>
										
									</c:when>
									<c:otherwise>
										<td><a href="/user/login">${vo.title}</td>
									</c:otherwise>
									</c:choose>
								</c:when> 
								<c:otherwise>
									<td><a href="/board/read/${vo.bno}?curPage=${to.curPage}">
									<c:choose>
										<c:when test="${not empty vo.repindent}">
										
										<c:forEach begin="1" end="${vo.repindent}">
											&nbsp;&nbsp;
										</c:forEach>
										<c:forEach begin="1" end="${vo.repindent}">
											Re:
										</c:forEach>${vo.title}</td>
										</c:when>
									
										<c:otherwise>
										${vo.title}</td>
										</c:otherwise>
									</c:choose>
										
									
										
								</c:otherwise>
							</c:choose>

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
			<a href="/qnatypelistpage/listpage">관리자페이지</a>
		</div>
	</div><!-- class= conatainer  -->
	<script type="text/javascript">
		$(document).ready(function() {
			$(".secretqna").click(function(){
				$.ajax({
					type: 'post',
					url: "/board/secret",
					data: {
						'str':'비밀글입니다.',
					},
					dataType: 'text',
					success: function(result){
						alert(result);
						
					}
				});
			});
			
		}); 
		</script>
		
	
</body>
</html>
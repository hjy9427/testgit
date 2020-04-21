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
				<input type="hidden" name="qnatype" value="${qnatype}">
			</form>

		<div class="row">
		<div class="jumbotron">
				<h1>QNA 관리자용</h1>
			</div>
		<form method="get">
			<div class="form-group">
				<label for="qnatype">문의유형</label>
					<select id="qnatype" name="qnatype" style="display:inline-block">
						<option ${qnatype=='a'?'selected':''} value="a">홈페이지 문의</option>
			  			<option ${qnatype=='b'?'selected':''} value="b">상품문의</option>
			  			<option ${qnatype=='c'?'selected':''} value="c">배송문의</option>
			  			<option ${qnatype=='d'?'selected':''} value="d">기타</option> 
					</select>
					<input id="submitqnatype" value="submit" type="submit">			 
			</div>
		</form>
	
			</table><table class="table">
				<thead>
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
					<c:forEach items="${pto.qlist}" var="vo">
						<tr>
							<td>${vo.bno}</td>
						<c:choose>
							<c:when test="${vo.qnatype=='a'}">
								<td>홈페이지 문의</td>
							</c:when>
							<c:when test="${vo.qnatype=='b'}">
								<td>상품 문의</td>
							</c:when>
							<c:when test="${vo.qnatype=='c'}">
								<td>배송 문의</td>
							</c:when>
							<c:otherwise>
								<td>기타</td>
							</c:otherwise>
						</c:choose>
							<td><a href="/qboard/read/${vo.bno}?curPage=${pto.curPage}">
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
					<c:forEach var="var" end="${pto.stopPageNum}" begin="${pto.beginPageNum}">
						<li class="${pto.curPage==var?'active':''}"><a href="/qnatypelistpage/listpage?qnatype=${qnatype}&curPage=${var}">${var}</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
<script type="text/javascript">
		$(document).ready(function() {
			$("#submitqnatype").click(function(){
				$.ajax({
					type: 'get',
					url: "/qnatypelistpage/listpage",
					data: {
						'qnatype':value,
					},
					dataType: 'text',
					success: function(result){
						
					}
				});
			});
			
		}); 
		</script>

</body>
</html>
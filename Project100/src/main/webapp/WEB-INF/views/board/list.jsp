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
		<div class="row">
		<!--디브 기능 하나  -->
			<table class="table">
			<!--부트스트랩은 클래스기반이라 클래스이름을 적어줘야 됨  -->
				<thead>
				<!--컬럼명적기  -->
					<tr>
						<th>bno</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="vo">
						<tr>
							<td>${vo.bno}</td>
							<%-- <c:if test="${vo.secretno}==1">

									<td><a href="/board/read/${vo.bno}">${vo.secretno}${vo.title}</a></td>
								
									
							</c:if>
									<td><a href="/board/insert">${vo.title}</a></td>			
							 --%>
							 <%-- <td><a href="/board/read/${vo.bno}">${vo.secretno}</a></td> --%>
							
							<td>${vo.writer}</td>
							<td>${vo.updatedate}</td>
							<td>${vo.readcnt}</td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div><!-- class=row  -->
		<div class="row">
			<a href="/board/insert">글쓰기</a>
		</div><!--class=row  -->
	</div><!-- class= conatainer  -->
</body>
</html>
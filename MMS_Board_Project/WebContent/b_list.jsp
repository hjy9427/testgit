<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"/>

	<a href="binsertui.do">�۾���</a>
	<h1>�Խ���</h1>
	<a href="bsearch.do">�˻�</a> 
	<a href="blistreadcnt.do">��ȸ�� ���� �� ����</a>
	<table border="1">
		<thead>
			<tr>
				<th>num</th>
				<th>title</th>
				<th>�ۼ���</th>
				<th>�ۼ���</th>
				<th>��ȸ��</th>
				<!--repindent�����  -->
				<th>good</th>
				<th>bad</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.num}</td>
					<td>
					
					<c:forEach begin="1" end="${dto.repIndent}">
						&nbsp;&nbsp;
					</c:forEach>
					
					<a href="bread.do?num=${dto.num}&curPage=${to.curPage}">${dto.title}</a>
					
					</td>
					<td>${dto.author}</td>
					<td>${dto.writeday}</td>
					<td>${dto.readcnt}</td>
					<td>${dto.good}</td><!--��õ��  -->
					<td>${dto.bad}</td><!--���߼�  -->
				</tr>
			
			</c:forEach>
		</tbody>
	
	
	</table>
	
	
	<jsp:include page="b_page.jsp"/>
	<br>
	
	<jsp:include page="footer.jsp"/>
	
	
	
	


</body>
</html>
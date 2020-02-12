<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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

<jsp:include page="header.jsp"/>
	<c:choose>
		<c:when test="${not empty login}">
			<a href="binsertui.do">�۾���</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('�α����� ���� �ϼ���')">�۾���</a>
		</c:otherwise>
	</c:choose>
	<h1>�Խ���</h1>
	
	<a href="blistreadcnt.do">��ȸ�� ���� �� ����</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>num</th>
				<th>title</th>
				<th>�ۼ���</th>
				<th>�ۼ���</th>
				<th>��ȸ��</th>
				<th>���ƿ�</th>
				<th>�Ⱦ��</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.num}</td>
					<td>
					<!-- �鿩���� -->
					<c:forEach begin="1" end="${dto.repIndent}"> <!-- ���� ���� �鿩���Ⱑ �ȵǰ� 1���� ���� -->
						&nbsp;&nbsp;
					</c:forEach>
					<a href="bread.do?num=${dto.num}">${dto.title}</a></td>
					<td>${dto.author}</td>
					<td>${dto.writeday}</td>
					<td>${dto.readcnt}</td>
					<td>${dto.good}</td>
					<td>${dto.bad}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<%-- ����¡ --%>
	<%-- html�ּ�(<!-- -->) ���� ���� �� �ּ� ����!!!!!!!!! --%>
	<%-- �Ķ��׼��±װ� ���� ����  [[[ <jsp:include page=""></jsp:include> �������� <jsp:include page=""/> ]]]  --%> 
	<jsp:include page="b_page.jsp"/>
	
	
			 <form action = "bsearch.do" method="get" style="diaplay:block ">
			 <select class="one" name="target" style="display:inline-block;with:82px;height:30px;margin-left:800px;">
			
			  <option  value="0">����</option>
			  <option value="1">����</option>
			  <option value="2">����+����</option>
			  <option value="3">�۾���</option>
			
			  </select>
			  <input style="height:30px;" type="text" size="20" name="condition"/>&nbsp;
			  <input type="submit" class="btn btn-primary" style="height:33px;" value="�˻�"/>
			 </form>
			 
	
	<jsp:include page="footer.jsp"/>


</body>
</html>
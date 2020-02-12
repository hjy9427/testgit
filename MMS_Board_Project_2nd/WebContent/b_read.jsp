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



<div class="container">
<div class="row">
<table class="table table-striped" style="text-align:center; border:1px solid powderblue ;width:700px; margin-left:200px;border-radius: 5px;">
<thead>
<th colspan="3" style="background-color:powderblue; text-align:center; color:black;font-size:25px;border-radius: 5px;">게시판 글보기 </th>
</thead>
<tbody>
<tr>
<td style="width:20%;">글 번호</td>
<td colspan="2">${dto.num}
</tr>
<tr>
 <td style="width:20%;">글 제목</td>
<td colspan="2">${dto.title}</td>
</tr>
<tr>
<td>작성자</td>
<td colspan="2">${dto.author}</td>
</tr>
<tr>
<td>작성일자</td>
<td colspan="2"> ${dto.writeday}
</tr>
<tr>
<td>조회수</td>
<td colspan="2"> ${dto.readcnt}</td>
</tr>
<tr>
<td colspan="2" style="min-height:200px; text-align:left; height:300px">${dto.content}</td>
</tr>
	</tbody>
	</table>
</div>
</div>

<div class="container" style="text-align:center; margin-left:560px; width:200px;">
	<c:choose>
		<c:when test="${not empty login}">
			<a href="breplyui.do?num=${dto.num}" class="btn btn-primary "style="width:50px;">답글</a>
		</c:when>
		<c:otherwise>
			<a href="mloginui.do" onclick="alert('로그인을 먼저 하세요')" class="btn btn-primary "style="width:50px;">답글</a>
		</c:otherwise>
	</c:choose>
	
		<c:choose>
		<c:when test="${login.id == dto.author || login.id == 'admin'}">
			<a href="bupdateui.do?num=${dto.num}" class="btn btn-primary "style="width:50px;">수정</a>
		</c:when>
		<c:otherwise>
			<a href="bread.do?num=${dto.num}" onclick="alert('ID가 일치하지 않습니다')" class="btn btn-primary "style="width:50px;;">수정</a>
		</c:otherwise>
	</c:choose>
	
		<c:choose>
		<c:when test="${login.id == dto.author || login.id == 'admin' }">
			<a href="bdelete.do?num=${dto.num}" class="btn btn-primary "style="width:50px; ">삭제</a>
		</c:when>
		<c:otherwise>
			<a href="bread.do?num=${dto.num}" onclick="alert('ID가 일치하지 않습니다')" class="btn btn-primary "style="width:50x;">삭제</a>
		</c:otherwise>
	</c:choose>
</div>


<jsp:include page="b_goodbad.jsp"/>


<%-- <script type="text/javascript">

		$("#good").click(function() { 
			var good = $("input[name='id']").val(); 
			
			$.ajax({
	            type:'post',
	            url   : 'good.do',
	            data: {
	               good : good
	            },
	            dataType:'json',
	            success: function(result){
	               $("p").text(result);
	            }
			});
		});

</script>--%>



</body>
</html>
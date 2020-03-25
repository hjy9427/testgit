<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.naver.dto.NoticeBoardVO"%>
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
						NoticeBoardVO vo=(NoticeBoardVO)request.getAttribute("vo");
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
				<%-- value="${param.curPage}"도 되긴한데 --%>
				<!--param은 되도록이면 쓰지 말기  -->
			</form>
			<div class="form-group">
				<c:if test="${not empty login}">
				<button id="reply_form" class="btn btn-info">댓글</button>
				</c:if>
				
				
				<c:if test="${vo.writer==login.id}">
				<button class="btn btn-success">수정</button>
				<button class="btn btn-danger">삭제</button>
				</c:if>
				
				<button class="btn btn-primary">목록</button>
			</div>
		</div><!--class row  -->
		<div class="row">
			<div id="myCollapsible" class="collapse"><!--열렸다가 닫혔다가 함  -->
				<div class="form-group">
					<label for="replyer">작성자</label>
					<input class="form-control" id="replyer" name="replyer">
				</div>
				<div class="form-group">
					<label for="replytext">내용</label>
					<input class="form-control" id="replytext" name="replytext">
				</div>
				
				<div class="form-group">
					<button id="insertReply" class="btn btn-warning">댓글 등록</button>
					<button class="btn btn-default">댓글 취소</button>
				</div>
			</div>
		</div><!--class=row  -->
		<div class="row">
			<div id="replies"><!--댓글넣기  -->
				
				<%-- <div class="panel panel-info">
					<div class="panel-heading">
							<span>rno: 1, 작성자: 홍길동</span>
							<span class="pull-right">2020-02-21 09:23</span>
						
					</div>
					<div data-rno="3" class="panel-body">
						data-이름 
						속성을 만들 수 있음
						<p>댓글 내용이 들어갑니다</p>
						<button class="btn btn-link btn-update">수정</button>
						<button class="btn btn-link btn-delete">삭제</button>
					댓글이 여러개 들어가니까
					버튼이 하나만 들어가는게 아니라 반복돼서 들어가니까 아이디 쓰면 
					안됨 대신 클래스에 이름 하나 더 추가  btn-update btn-delete
					</div>
				</div>동적으로 채워넣음 
				append이용하면 기존 것에 추가되는 거 하나 더 표시됨 --%>
			</div>
		</div><!--class=row  -->
		<div class="row">
			<div id="myModal" class="modal">
				<div class="modal-dialog">
					<div class="modal-header">
						<button class="close" data-dismiss="modal">&times;</button>
						<!--오른쪽상단의 엑스버튼 모달 없애는 버튼 -->
						<p id="modal_rno">11</p>
					</div>
					<div class="modal-body">
						<input value="hello world" class="form-control" id="modal_replytext">					
					</div>
					<div class="modal-footer">
						<button data-dismiss="modal" id="modal_update" class="btn btn-warning btn-xs">수정</button>
						<button data-dismiss="modal" id="modal_close" class="btn btn-warning btn-xs">취소</button>
					</div>
				</div>
			</div>
		</div><!--class=row  -->
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
			
			
			$("#modal_update").click(function(){
				var rno=$("#modal_rno").text();
				var replytext=$("#modal_replytext").val();
				
				$.ajax({
					type:"put",
					url:"/replies",
					headers:{
						"Content-Type":"application/json",
						"X-HTTP-Method-Override":"PUT"
					},
					data:JSON.stringify({
						rno:rno,
						replytext:replytext
					}),
					dataType:"text",
					success:function(data){
						alert(data);
						getList(bno);
					}
				});
			});
			
			$("#replies").on("click", ".btn-update", function() {
				$("#myModal").modal("show");
				var rno=$(this).parent().attr("data-rno");
				var replytext=$(this).prev("p").text();
				$("#modal_rno").text(rno);
				$("#modal_replytext").val(replytext);
				
				
			});
			
			
			$("#replies").on("click", ".btn-delete", function(){
				var rno=$(this).parent().attr("data-rno");
				/*클릭한거의 부모   
				괄호 안에 값 두 개 입력하는거면 왼쪽 속성에 오른쪽값넘겨줘라
				하나만 있으면 그 값 가져와라*/
				$.ajax({
					type:"delete",
					url:"/replies/"+rno,
					headers:{
						"Content-Type":"application/json",
						"X-HTTP-Method-Override":"DELETE"
					},
					
					success:function(result){
						alert(result);
						getList(bno);
					}
				});
				
			});
			
			$("#insertReply").click(function(){
				var replyer= $("#replyer").val();
				var replytext=$("#replytext").val();
				
				$.ajax({
					type:'post',
					url:'/replies',
					headers:{
						'Content-Type':'application/json',
						'X-HTTP-Method-Override':'POST'
					},
					data:JSON.stringify({
						replyer:replyer,
						replytext:replytext,
						bno:bno
					}),
					dataType:'text',
					success:function(result){
						alert("insert success");
						$("#replyer").val('');
						$("#replytext").val('');
						getList(bno);
					}
				});
				
			});
			
			$("#reply_form").click(function(){
				$("#myCollapsible").collapse("toggle");
			});
			
			
			
			
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
			
			$(".btn-danger").click(function(){
				$("form").attr("method", "post");
				$("form").attr("action", "/board/delete/${vo.bno}/${curPage}");
				
				
				$("form").submit();
			});
			getList(bno);
		
		});
		
		function getList(bno){
			$.getJSON("/replies/"+bno, function(data){
					/*pathvariable annotation필요  */
				/* console.log(data); */
				var str='';
				for (var i = 0; i < data.length; i++) {
					/*int 쓰면 안됨 var 써야함 자바스크립트에선  */
					var obj=data[i];
					str+='<div class="panel panel-info"><div class="panel-heading"><span>rno: '+obj.rno+', 작성자: '+obj.replyer+'</span><span class="pull-right">'+obj.updatedate+'</span></div><div data-rno="'+obj.rno+'" class="panel-body"><p>'+obj.replytext+'</p><button class="btn btn-link btn-update">수정</button><button class="btn btn-link btn-delete">삭제</button></div></div>'
					/*속성을 큰따옴표로 묶어놨기 때문에 작은따옴표 사용 */
				}
				
				$("#replies").html(str);
			});
		}

	</script>

</body>
</html>
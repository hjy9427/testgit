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
		.fileDrop{
			width:100%;
			height:200px;
			border:1px solid green;
			background-color:lightslategray;
			margin:auto;
		}
		.uploadedList{
			list-style:none;
		}
		.uploadedList li{
			margin-top:20px;
		}

</style>

</head>
<body>
	<div class="container">
		<div class="row">
		<div class="jumbotron">
		<h1>글쓰기</h1>
		</div>
		
			<form method="post">
				<!--첨부파일작업을 위해 액션 제거  -->
				<div class="form-group">
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
			<!--form-control 한 줄 form- group 묶어주는거  -->
				<label>업로드할 파일을 드랍시키세요</label>
				<div class="fileDrop"></div>
			</div>
			<ul class="uploadedList clearfix">
				<!-- <li class="col-xs-3">
					<img src="/resources/img/gt.png">
					<div>
						<span>gt.png</span>
						<a class="btn btn-danger btn-xs delbtn" href="#"><span class="glyphicon glyphicon-remove"></span></a>
						사이트 들어가서클래스이름에 이름 복붙 
					</div>
				</li> -->
			</ul>
						
			<div class="form-group">
				<button class="btn btn-primary" type="submit">등록</button>
				<button class="btn btn-warning" type="reset">초기화</button>
			</div>
		</div>
	</div>

<script type="text/javascript">
	$(document).ready(function() {
		$(".uploadedList").on("click", ".delbtn", function(event){
			event.preventDefault();
			
			var that=$(this);
			var filename=that.attr("href");
			
			$.ajax({
				type:"post",
				url:"/deletefile",
				data: {
					filename:filename
				},
				dataType:"text",
				success: function(data){
					that.parent("div").parent("li").remove();
				}
			});
			
		});
		
			
			$(".fileDrop").on("dragenter dragover", function(event){
				event.preventDefault();
			});
			
			$(".fileDrop").on("drop", function(event){
				event.preventDefault();
				var arr=event.originalEvent.dataTransfer.files;
				
				/* for(var i;i<files.length;i++){
				var file=files[i];
				아래와 동일
				} 여러개 드래그해서 올릴 떄
				*/
				var file=arr[0];/* 하나만 파일 올림 */
				var formData=new FormData();
				/*폼태그에 데이터를 집어넣음  */
				formData.append("file", file);
				
				$.ajax({
					type:"post",
					url:"/uploadajax",
					data: formData,
					dataType:"text",
					processData:false,
					contentType:false,
					success: function(data){
						iconAppend(data, true);
						/* var str="<li class='col-xs-3'>";
						if(checkImg(data)){
							str+="<img src='/display?filename="+data+"'>";
						}else{
							str+="<img src='/resources/img/gt.png'>"
						}
						str+="<div>";
						str+="<span>"+getOriginalName(data)+"</span>";
						str+="<a class='btn btn-danger btn-xs delbtn' href='#'><span class='glyphicon glyphicon-remove'></span></a>"
						
						str+="</div>";
						$(".uploadedList").append(str);
					} */
						/* var str='';
						if(checkImg(data)){
							str+='<li class="col-xs-3"><img src="/display?filename='+data+'"><div><span>'+getOriginalName(data)+'</span><a class="btn btn-danger btn-xs delbtn" href="#"><span class="glyphicon glyphicon-remove"></span></a></div></li>';
						}else{
							str+='<li class="col-xs-3"><img src="/resources/img/gt.png"><div><span>'+getOriginalName(data)+'</span><a class="btn btn-danger btn-xs delbtn" href="#"><span class="glyphicon glyphicon-remove"></span></a></div></li>';
						}
						//이미지일떄만 가능
						$(".uploadedList").append(str);  */
						/*두 개 같은 방법임  */
					}
						
			});
		}); 
		
		
		
		$("button[type='submit']").click(function(event){
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
				
				/* $("form").submit(); */
				/* 폼태그 여러개 있으면 배열되어서 순서 정해줘야함 
				서브밋은 제출*/
			event.preventDefault();
				var msg="";
				
				$(".delbtn").each(function(index){
				var filename =$(this).attr("href");
				msg+="<input name='filename["+index+"]' value='"+filename+"' type='hidden'>"
			});
				$("form").append(msg);
				$("form").submit();
				/* var arr=$(".delbtn").attr("href");
			for(var i=0; i<arr.length; i++){
				console.log(arr[i]);
			} 안됨*/
		});
		$("button[type='reset']").click(function(){
			location.href = "/board/list";
		});
		
	}); 
	
	
	
</script>
</body>
</html>
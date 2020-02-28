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
<style type="text/css">
.fileDrop{
	width: 100%;
	height:200px;
	border:1px dotted red;
}

</style>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="fileDrop"></div>
			<!--드래그해서 파일 업로드  -->
			<div class="uploadedList"></div>
		</div><!--class=row  -->
	</div><!--class=container  -->
	
	<!-- <img alt="" src="/resources/img/gt.png"> -->
	
	<script type="text/javascript">
		$(document).ready(function(){
			$(".uploadedList").on("click", "small", function(event){
				var that=$(this);
				$.ajax({
					type:"post",
					url:"/deletefile",
					data:{
						filename:$(this).attr("data-src")
					},
					dataType:"text",
					success:function(data){
						that.parent("p").parent("div").remove();
						
						//$(this).remove(); 안됨
						//통신이 끝나서 이렇게만 ㅁ스면 안됨
						//그래서 미리 var that 써둠
						//that의 parent의 parent가 div
						//that의 parent는 p태그
						//괄호 안은 없어도됨
					}
				});
				
			});
			//동적으로 만들어진 애는 잘 작동이 안 될 수 있으니까 정적인 애를 찾아서 해줌
			//스몰태그는 동적임 
			//온 안쪽 내용은 스몰 클릭하면 이벤트 일어난단뜻
			//이미지 파일 여러개넣으면 스몰 여러개생김
			//this써주면 지금 누른 그 스몰이란뜻
			
			$(".fileDrop").on("dragenter dragover", function(event){
				event.preventDefault();
			});
			
			$(".fileDrop").on("drop", function(event){
				event.preventDefault();
				var files=event.originalEvent.dataTransfer.files;
				var file=files[0];
				var formData=new FormData();
				formData.append("file", file);
				
				$.ajax({
					type:"post",
					url:"/uploadajax",
					data: formData,
					dataType:"text",
					processData:false,/*어떤걸로보내냐  */
					contentType:false,
					success: function(data){
						var str="<div class='up_thumb'>";
						//이거 div추가한 이유는 
						//small 눌러서 이미지 제거할 때 이거
						//다 제거해야돼서
						if(checkImg(data)){
							str+="<a target='_blank' href='display?filename="+getImageName(data)+"'><img src='display?filename="+data+"'></a>";
							
						}else{
							str+="<a href='display?filename="+data+"'><img alt='일반파일썸네일' src='/resources/img/gt.png'></a>";
							//여기에 alt는 반드시 넣어줘야함 ""로 감싸져있으니까 안에는 작은따옴표
							//다운로드하기
						}
						str+="<p>"+getOriginalName(data)+" <small data-src='"+data+"'>X</small>"+"</p>";
						//data-src 속성명 하나 만든거임
						str+="</div>";
						$(".uploadedList").append(str);
					}
				});
			});
			/* alert(checkImg("a.png")); */
		});
		
		
		function checkImg(filename) {
			var type=filename.substring(filename.lastIndexOf(".")+1);
			type=type.toLowerCase();
			if(type=="png" || type=="jpg" || type=="jpeg" || type=="gif"){
				return true;
			}else{
				return false;
			} 
			//정규식으로 표현하면 간단하게 됨
			/* var pattern =/jpg|jpeg|png|gif/i;
			//ignore i 대소문자 무시하란 의미
			//문제 있음 gif인데 확장자명이 txt면 true나옴
			return filename.match(pattern); */
		}
		
		function getOriginalName(filename){
			if(checkImg(filename)){
				var idx=filename.indexOf("_", 14)+1;
				//파일명에서 날짜 지우고 첫번쨰 언더바 지우면
				//14번째부터임 /2010/01/01/s_asdasdf
				//파일명 이런식으로 되게 해뒀으니까
			}else{
				var idx=filename.indexOf("_")+1;
			}
			filename=filename.substring(idx);
			return filename;
		}
		
		function getImageName(filename){
			var prefix=filename.substring(0, 12);
			var suffix=filename.substring(14);
			return prefix+suffix;
		}
		
	</script>
</body>
</html>
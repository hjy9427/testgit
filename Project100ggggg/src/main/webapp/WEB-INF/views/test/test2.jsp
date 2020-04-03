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
		<div class="row">
			<button class="btn btn-success">test2</button>
			<div id="test">
				
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("button").click(function(){
				var arr=["hello", "world", "good", "morning"];
				
				$.ajax({
					type:'post',
					url: "/test/test2",
					traditional :true,
					data: {
						'arr' : arr
						//앞에껀 프로퍼티명 뒤에껀 변수명
						//자바스크립트에서 큰따옴표작은따옴표상관무
					},
					dataType: 'text',
					success:function(result){
						console.log(result);
						var arr2=eval(result);
						//문자열을 자바스크립트의 문법에 맞는걸로 바꿔줌
						var msg='';
						for (var i = 0; i < arr2.length; i++) {
							msg+="<p>"+arr2[i]+"</p>";
						}
						alert(msg);
						$("div#test").append(msg);
					}
				});
			});			
		});
	</script>
</body>
</html>
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
			<button class="btn btn-success">test22</button>
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
					url: "/test/test22",
					traditional :true,
					data: {
						'arr' : arr
					},
					dataType: 'text',
					success:function(result){
						var arr2=JSON.parse(result);
						//result를 제이슨형태의 데이터를 오브젝트로바꿔줌
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
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
			<button class="btn btn-info">test1</button>
		</div>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("button").click(function(){
				$.ajax({
					/*속성 암기하기 순서대로  */
					type: 'post',
					url: "/test/test1",
					data: /*데이터를 가지고 감 
					json형태로*/{
						'str':'hello',
					},
					dataType: 'text',
					success: function(result){
						alert(result);
					}/*finally역할하는 complete도 있음 여기선 생략  */
				});
				
			});
		});	
	
	
	</script>

</body>
</html>
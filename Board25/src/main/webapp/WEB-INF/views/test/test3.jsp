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
			<input>
		</div>
		<div class="row">
			<button class="btn btn-default">test3</button>
		</div>
		
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$("button").click(function(){
				var val = $("input").val();/*값을 가져오는 ㄱ임 */
				/* var val = $("input").val('abc');
				값을 넣는거임*/
				$.ajax({
					type:'post',
					url:'/test/test3',
					data:{
						/*JSON형태 자바스크립트 새로운 명명법 */
						/*속성명을 큰따옴표나 작은따옴표로 감싸줌  */
						/* 'title':'t1', */
						'title':val,
						'writer':'w1',
						'content':'c1'
					},
					dataType:'text',
					success:function(result){
						alert(result);
						console.log(result);
						var obj=JSON.parse(result);
						alert(obj.title);
						alert(obj.writer);
						alert(obj.content);
						/*{"bno":0,"title":"t1","content":"c1","writer":"w1","regdate":null,"updatedate":null,"readcnt":0}
						콘솔창에 이렇게 뜸*/
					}
				});
			});	
			
		});
	
	
	</script>

</body>
</html>
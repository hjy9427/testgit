<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.naver.dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

	<% 
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m001", 11, "kim"));
		list.add(new MemberDTO("m002", 22, "lee"));
		list.add(new MemberDTO("m003", 33, "pakr"));
		
		ObjectMapper mapper= new ObjectMapper();
		String mList=mapper.writeValueAsString(list);
		/*string형으로 만들어줌  
		EL은 jsp변수를 인식못함
		그래서 바인딩해줌
		이 페이지 안에서만 사용할거니까 페이지컨텍스트*/
		pageContext.setAttribute("mList", mList);
	%>
	
	
	<div class="container">
		<div class="row">
			<input>
			<button class="btn btn-warning">test4</button>
		</div>
	</div>

	<script type="text/javascript">
		$(document).ready(function(){
			$("button").click(function(){
				var val=$("input").val();
				$.ajax({
					type:'post',
					url:'/test/test4',
					data:{
						mList:JSON.stringify(${mList})
						/*객체를 문자열로  */
						/*에러나도 그냥 놔두기 */
					},
					dataType:'text',
					success:function(result){
						/* console.log(result); */
						/* [{"id":"m001","age":11,"name":"kim"},
							{"id":"m002","age":22,"name":"lee"},
							{"id":"m003","age":33,"name":"pakr"}]
						콘솔에 이렇게 나오는데 대괄호는 배열
						중괄호 하나하나가 제이슨임
						이 떄 콘솔은 웹브라우저에서 에프십이눌러너 나오는 콘솔*/
						var arr=JSON.parse(result);
						for (var i = 0; i < arr.length; i++) {
							var obj=arr[i];
							alert(obj.id);
							alert(obj.name);
							alert(obj.age);
						}
					}
				});
			});
		});
	</script>

</body>
</html>
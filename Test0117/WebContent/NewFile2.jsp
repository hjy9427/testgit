<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	<h1>declaration tag(선언 태그)</h1>
	<%=msg %>밑에서 선언해도 위에서 인식됨
	<%=me1() %>
	<%! 
		String msg = "hello";
		public int me1() {
			return 3;
		}
	%>멤버변수나 메서드 선언하는 필드영역역할함
	<%=msg %>
	<%=me1() %>
	
	
</body>
</html>
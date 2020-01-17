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
	<h1>Scriptlet tag</h1>
	<%=a %>에러뜸
	<%!
		public void me1(){
			System.out.print("hello");
			out.print("hello");	
	}
	%>jsp 내장객체 인식 안됨 그래서 아웃이라 쓰면 인식안됨
	 시스템 써줘야 인식함
	<% 
		int a = 3;
		me1();
		a=5;
	%>꺽쇄퍼센트 내부 그 차제가 스크립틀릿태그 이 안에선 지역변수됨
	메서드 생성불가
	메서드 호출가능
	
	<%=a %>
	<% 
		int a = 6;
	%>duplicated local variable a 에이 두번 써서 에러남
	 
	
	
</body>
</html>
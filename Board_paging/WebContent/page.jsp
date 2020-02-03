<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	
	
<c:if test="${to.curPage > 1}">
<a href="list.do?curPage=${to.curPage-to.curPage%10-9 }">&laquo;&nbsp;&nbsp;</a>
</c:if>
<!-- 팀프로젝트 떄하기 
	원글 삭제시 답글도 삭제 본인은 볼 수 있게 하기
	누적글갯수방문자수조회수등등
	차트 js라는게있음
	유저를세개로 쪼개서하기 클라이언트 관리자 경영자-->
<c:if test="${to.curPage > 1}">
<a href="list.do?curPage=${to.curPage-1}"><&nbsp;&nbsp;</a>

</c:if>


<c:forEach var="i" begin="${to.beginPageNum}" end="${to.stopPageNum}">
	<a style="font-size:20px; ${i==to.curPage? 'color:red;' : ''}" href="list.do?curPage=${i}">${i}</a>&nbsp;&nbsp;

</c:forEach>
<c:if test="${to.curPage<to.totalPage}">
<a href="list.do?curPage=${to.curPage+1}">>&nbsp;&nbsp;</a>
</c:if>
<c:if test="${to.curPage <to.totalPage}">
<a href="list.do?curPage=${to.curPage-to.curPage%10+11 }">&raquo;&nbsp;&nbsp;</a>
</c:if>

	





<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<%


%><c:if test="${to.stopPageNum -10 > 1}">
	<a href="blist.do?curPage=${to.beginPageNum-10 <1 ? 1 : to.beginPageNum-10}"> <<   &laquo;</a>
</c:if>
<a>&laquo;</a>

<c:if test="${to.curPage>1}">
 <a href="bsearch.do?curPage=${to.curPage-1}&target=${value}&condition=${condition}">< &nbsp;&nbsp;</a>
</c:if>
 
<c:forEach var="i" begin="${to.beginPageNum}" end="${to.stopPageNum}">
 <a href="bsearch.do?curPage=${i}&target=${value}&condition=${condition}" style="font-size:20px;  ${i == to.curPage? 'color:powderblue':''}">${i}</a>&nbsp;&nbsp;

</c:forEach>

<c:if test="${to.curPage< to.totalPage}">
<a href="bsearch.do?curPage=${to.curPage+1}&target=${value}&condition=${condition}">></a>
</c:if>

<c:if test="${to.stopPageNum != to.totalPage}">
	<a href="blist.do?curPage=${to.stopPageNum+1}">&raquo;</a>
</c:if>
 
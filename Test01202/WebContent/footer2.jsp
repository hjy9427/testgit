<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <%
    	String id = request.getParameter("id");
    	String name = request.getParameter("name");
    %>
    
    <%= id %>  : <%= name %>   
    
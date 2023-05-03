<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="db.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
<h1>Books2s</h1>
<%
for(String name : DatabaseFasade.getBooks()){
	out.println(name + "<br/>");
}
%>
</body>
</html>
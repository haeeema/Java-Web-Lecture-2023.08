<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	pageContext.setAttribute("name", "Page scope");
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Scope</title>
<style>td { padding: 3px; }</style>
</head>
<body style="margin: 40px;">
	<h1>Scope</h1>
	<hr>
	<table border="1">
		<tr><td></td><td></td></tr>
		<tr><td>\${sessionScope.sName}</td><td>${sessionScope.sName}</td></tr>
		<tr><td>\${requestScope.mName}</td><td>${requestScope.mName}</td></tr>
		<tr><td>\${sName}</td><td>${sName}</td></tr>
		<tr><td>\${mName}</td><td>${mName}</td></tr>
		<tr><td></td><td></td></tr>
		
		<tr><td>\${sessionScope.name}</td><td>${sessionScope.name}</td></tr>
		<tr><td>\${requestScope.name}</td><td>${requestScope.name}</td></tr>
		<tr><td>\${pageScope.name}</td><td>${pageScope.name}</td></tr>
		<tr><td>\${name}</td><td>${name}</td></tr>
		<%-- Application > Session > Request > Page --%>
		<tr><td></td><td></td></tr>
		
		<tr><td>\${cookie.JSESSIONID.name}</td><td>${cookie.JSESSIONID.name}</td></tr>
		<tr><td>\${cookie.JSESSIONID.value}</td><td>${cookie.JSESSIONID.value}</td></tr>		
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>JSTL</title>
<style>td, th { padding: 3px; }</style>
</head>
<body style="margin: 40px;">
	<h1>JSTL function tag</h1>
	<hr>
	<table border="1">
		<tr style="font-weight: 500;"><td>Express Language</td><td>Results</td></tr>
		<tr><td>\${str1} \${str3}</td><td>${str1} ${str3}</td></tr>
		<tr><td>\${fn:length(str1)}</td><td>${fn:length(str1)}</td></tr>
		<tr><td>\${fn:toUpperCase(str2)}</td><td>${fn:toUpperCase(str2)}</td></tr>
		<tr><td>\${fn:toLowerCase(str3)}</td><td>${fn:toLowerCase(str3)}</td></tr>
		<tr><td>\${fn:substring(str2, 0, 2)}</td><td>${fn:substring(str2, 0, 2)}</td></tr>
		<tr><td>\${fn:replace(str2, " ", "-")}</td><td>${fn:replace(str2, " ", "-")}</td></tr>
		<tr><td>\${fn:indexOf(str2, str3)}</td><td>${fn:indexOf(str2, str3)}</td></tr>
		<tr><td>\${fn:contains(str2, str3)}</td><td>${fn:contains(str2, str3)}</td></tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>JSTL</title>
<style>td { padding: 3px; }</style>
</head>
<body style="margin: 40px;">
	<h1>JSTL(JSP Standard Tag Library) Core</h1>
	<hr>
	<table border="1">
		<tr><td colspan="2"></td></tr>
		<tr><td>\${memberArray}</td><td>${memberArray}</td></tr>
		<tr><td>\${memberArray[0].id}</td><td>${memberArray[0].id}</td></tr>
		<tr><td>\${memberArray[0].name}</td><td>${memberArray[0].name}</td></tr>
		<tr><td>\${memberArray[0].addr.city}</td><td>${memberArray[0].addr.city}</td></tr>
		<tr><td></td><td></td></tr>
		<c:set var="mem0" value="${memberArray[0]}"></c:set>
		<tr><td>\${memberArray}</td><td>${memberArray}</td></tr>
		<tr><td>\${mem0.id}</td><td>${mem0.id}</td></tr>
		<tr><td>\${mem0.name}</td><td>${mem0.name}</td></tr>
		<tr><td>\${mem0.addr.city}</td><td>${mem0.addr.city}</td></tr>
	</table>
	<br>
	<table border="1">
		<tr><th>ID</th><th>Name</th><th>City</th><th>Country</th></tr>
		<tr>
			<td>${memberList[0].id}</td>
			<td>${memberList[0].name}</td>
			<td>${memberList[0].addr.city}</td>
			<td>${memberList[0].addr.country}</td>
		</tr>
		<tr>
			<td>${memberList[1].id}</td>
			<td>${memberList[1].name}</td>
			<td>${memberList[1].addr.city}</td>
			<td>${memberList[1].addr.country}</td>
		</tr>
	</table>
	<br>
	<table border="1">
		<tr><th>ID</th><th>Name</th><th>City</th><th>Country</th></tr>
	<c:forEach var="member" items="${memberArray}">
		<tr>
			<td>${member.id}</td>
			<td>${member.name}</td>
			<td>${member.addr.city}</td>
			<td>${member.addr.country}</td>
		</tr>
	</c:forEach>
	</table>
	<br>
	<table border="1">
		<tr><th>Index</th><th>Name</th><th>Address</th></tr>
	<c:forEach var="member" items="${memberList}" varStatus="loop">
		<tr>
			<td>${loop.index}</td>
			<td><%-- Odd blue, even red --%>
				<span style="color:${loop.count mod 2 eq 1 ? 'blue' : 'red'};">${loop.count}</span>
			</td>
			<td>
				<%-- The odd number blue, the even number red --%>
			<c:if test="${member.id mod 2 eq 1}">
				<span style="color: blue;">${member.id}</span>
			</c:if>
			<c:if test="${member.id mod 2 eq 0}">
				<span style="color: red;">${member.id}</span>
			</c:if>
			</td>
			<td>
				<%-- The first line background color yellow, the last line background color cyan --%>
			<c:if test="${loop.first}">
				<span style="background-color: yellow;">${member.name}</span>
			</c:if>
			<c:if test="${loop.last}">
				<span style="background-color: cyan;">${member.name}</span>
			</c:if>
			<c:if test="${not loop.first and not loop.last}">
				${member.name}
			</c:if>
			</td>
			<td>
				<%-- USA orange, Korea skyblue --%>
			<c:if test="${member.addr.country eq 'Korea'}">
				<span style="background-color: orange;">${member.addr.country}</span>
			</c:if>
			<c:if test="${member.addr.country eq 'USA'}">
				<span style="background-color: skyblue;">${member.addr.country}</span>
			</c:if>
			<c:if test="${not member.addr.country ne 'USA' and member.addr.country ne 'Korea'}">
				${member.addr.country}
			</c:if>
			</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
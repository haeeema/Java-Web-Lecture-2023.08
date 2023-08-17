<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>JSTL</title>
<style>td, th { padding: 3px; }</style>
</head>
<body style="margin: 40px;">
	<h1>JSTL format tag</h1>
	<hr>
	<table border="1">
		<tr><td>Express Language</td><td>Results</td></tr>
		<tr><td>Number</td><td>${price}</td></tr>
		<tr><td>Thousand</td>
			<td><fmt:formatNumber type="number" value="${price}" /></td></tr>
		<tr><td>Currency(KRW)</td>
			<td><fmt:formatNumber type="currency" currencySymbol="KRW " value="${price}" /></td></tr>
		<tr><td>Currency(USD)</td>
			<td><fmt:formatNumber type="currency" currencySymbol="$ " value="${price}" /></td></tr>
		<tr><td>Per cent</td>
			<td><fmt:formatNumber type="percent" value="${price / 100000000}" /></td></tr>
		<tr><td></td><td></td></tr>
		<tr><td>Date</td>
			<td>${now}</td></tr>
		<tr><td>Full date</td>
			<td><fmt:formatDate type="date" dateStyle="full" value="${now}"/></td></tr>
		<tr><td>Short date</td>
			<td><fmt:formatDate type="date" dateStyle="short" value="${now}"/></td></tr>
		<tr><td>Time</td>
			<td><fmt:formatDate type="time" value="${now}"/></td></tr>
		<tr><td>Both</td>
			<td><fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${now}"/></td></tr>
		<tr><td>Pattern("YYYY-MM-dd HH:mm:ss")</td>
			<td><fmt:formatDate pattern="YYYY-MM-dd HH:mm:ss" value="${now}"/></td></tr>
		<tr><td>Pattern("YY-MM-dd HH:mm")</td>
			<td><fmt:formatDate pattern="YY-MM-dd HH:mm" value="${now}"/></td></tr>
		<tr><td></td><td></td></tr>
		<tr><td>LocalDateNow</td><td>${ldNow}</td></tr>
		<tr><td>LocalTimeNow</td><td>${ltNow}</td></tr>
		<tr><td>LocalTimeNow2</td><td>${ltNow2}</td></tr>
		<tr><td>localDateTimeNow</td><td>${ldtNow}</td></tr>
		<tr><td>localDateTimeNow2</td><td>${ldtNow2}</td></tr>
	</table>
</body>
</html>
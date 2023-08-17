<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Collections</title>
<style>td { padding: 3px; }</style>
</head>
<body style="margin: 40px;">
	<h1>Collections</h1>
	<hr>
	<table border="1">
		<tr><td>Array</td><td></td></tr>
		<tr><td>\${fruitArray[0]}</td><td>${fruitArray[0]}</td></tr>
		<tr><td>\${fruitArray[1]}</td><td>${fruitArray[1]}</td></tr>
		<tr><td>\${fruitArray[2]}</td><td>${fruitArray[2]}</td></tr>
		<tr><td>\${fruitArray[3]}</td><td>${fruitArray[3]}</td></tr>
		<tr><td>List</td><td></td></tr>
		<tr><td>\${sportsList[0]}</td><td>${sportsList[0]}</td></tr>
		<tr><td>\${sportsList[1]}</td><td>${sportsList[1]}</td></tr>
		<tr><td>\${sportsList[2]}</td><td>${sportsList[2]}</td></tr>
		<tr><td>\${sportsList[3]}</td><td>${sportsList[3]}</td></tr>
		<tr><td>Map</td><td></td></tr>
		<tr><td>\${map.key}</td><td>${map.key}</td></tr>
		<tr><td>\${map.value}</td><td>${map.value}</td></tr>
		
	</table>
</body>
</html>
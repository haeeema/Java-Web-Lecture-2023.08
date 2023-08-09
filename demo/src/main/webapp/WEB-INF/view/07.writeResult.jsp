<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
    	<meta charset="UTF-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Writing</title>
		<style>
			td { padding: 3px; text-align: center; }
		</style>
	</head>
	<body>
		<h3>Writing</h3>
		<hr>
		<form action="/demo/write" method="post">
			<table>
				<tr>
					<td>Title</td>
					<td>${ board.title }</td>
				</tr>
				<tr>
					<td>Language</td>
					<td>${ board.languages }</td>
				</tr>
				<tr>
					<td>Content</td>
					<td>${ board.content }</td>
				</tr>
			</table>
		</form>
	</body>
</html>
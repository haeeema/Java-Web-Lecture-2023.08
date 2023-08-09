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
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>Language</td>
					<td>
						<input type="checkbox" name="language" value="kr"> Korean
						<input type="checkbox" name="language" value="en"> English
						<input type="checkbox" name="language" value="fr"> French
						<input type="checkbox" name="language" value="jp"> Japanese
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea name="content" rows="10" cols="50"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="submit">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
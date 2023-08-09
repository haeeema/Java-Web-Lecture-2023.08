<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Calculator</title>
	</head>
	<body>
		<h3>Simple calculator</h3>
		<hr>
		<form action="/demo/calc" method="post">
			<input type="text" name="a" placeholder="number">
			<select name="op">
				<option value="add" selected>+</option>
				<option value="sub">-</option>
				<option value="mul">*</option>
				<option value="div">/</option>
			</select>
			<input type="text" name="b" placeholder="number">
			<input type="submit" value="=">
		</form>
	</body>
</html>
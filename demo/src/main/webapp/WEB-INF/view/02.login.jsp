<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">F-8">
	<title>log-in</title>
	<style>
        th { padding: 5px; }
        td { text-align: center; padding: 5px; }
        .title {color: tomato;}
    </style>
</head>
<body>
	<h3>Log-in</h3>
    <form action="/demo/login" method="post">
        <table>
            <tr>
                <td style="text-align: left;">ID :</td>
                <td><input type="text" name="uid"></td>
            </tr>
            <tr>
                <td style="text-align: left;">password :</td>
                <td><input type="password" name="pwd"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="enter">
                    <input type="reset" value="cancel">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
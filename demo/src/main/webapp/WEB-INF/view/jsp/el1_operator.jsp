<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Expression language</title>
<style>td { paddingL 3px }</style>
</head>
<body style="margin: 40px;">
	<h1>EL Operator</h1>
	<hr>
	<table border="1">
		<tr><th>표현식</th><th>결과</th></tr>
		<tr><th>\${100}</th><th>${100}</th></tr>
		<tr><th>\${10 + 1}</th><th>${10 + 1}</th></tr>
		<%-- 11 --%>
		<tr><th>\${"10" + 1}</th><th>${"10" + 1}</th></tr>
		<%-- 11 --%>
		<tr><th>\${null + 1}</th><th>${null + 1}</th></tr>
		<%-- 1 --%>
		<tr><th>\${"hello"}</th><th>${"hello"}</th></tr>
<%--	<tr><th>\${"hello" + "hi"}</th><th>${"hello" + "hi"}</th></tr>		--%>
<%--	연산자는 오로지 숫자에만 사용		--%>
		<tr><th>\${"hello"} + \${"hi"}</th><th>${"hello"} + ${"hi"}</th></tr>
		<tr><th></th><th></th></tr>
		<tr><th>\${20 - 10}</th><th>${20 - 10}</th></tr>
		<tr><th>\${20 * 10}</th><th>${20 * 10}</th></tr>
		<tr><th>\${20 / 8}</th><th>${20 / 8}</th></tr>
		<tr><th>\${20 div 8}</th><th>${20 div 8}</th></tr>
		<tr><th>\${20 % 8}</th><th>${20 % 8}</th></tr>
		<tr><th>\${20 mod 8}</th><th>${20 mod 8}</th></tr>
		<tr><th></th><th></th></tr>
		<tr><th>\${20 == 10}</th><th>${20 == 10}</th></tr>
		<tr><th>\${20 eq 10}</th><th>${20 eq 10}</th></tr>
		<tr><th>\${20 ne 10}</th><th>${20 ne 10}</th></tr>
		<tr><th>\${"hi" == "hello"}</th><th>${"hi" == "hello"}</th></tr>
		<tr><th>\${20 > 10}</th><th>${20 > 10}</th></tr>
		<tr><th>\${20 gt 10}</th><th>${20 gt 10}</th></tr>
		<tr><th>\${20 ge 10}</th><th>${20 ge 10}</th></tr>
		<tr><th></th><th></th></tr>
		<tr><th>\${20 > 10 && "hi" == "hello"}</th><th>${20 > 10 && "hi" == "hello"}</th></tr>
		<tr><th>\${20 gt 10 and "hi" eq "hello"}</th><th>${20 gt 10 and "hi" eq "hello"}</th></tr>
		<tr><th>\${20 gt 10 or "hi" eq "hello"}</th><th>${20 gt 10 or "hi" eq "hello"}</th></tr>
		<tr><th>\${not ("hi" eq "hello")}</th><th>${not ("hi" eq "hello")}</th></tr>
		<tr><th></th><th></th></tr>
		<tr><th>\${empty "hello"}</th><th>${empty "hello"}</th></tr>
		<tr><th>\${empty ""}</th><th>${empty ""}</th></tr>
		<tr><th>\${empty null}</th><th>${empty null}</th></tr>
		<tr><th></th><th></th></tr>
	</table>
	<h3>Example</h3>
	<ul>
		<li>파라미터 값은 ${empty param.num ? '입력하지 않았음' : param.num}</li>
		<li><a class="nav-link ${menu eq 'board' ? 'active' : '' }" href='#'>Active</a></li>
	</ul>
</body>
</html>















<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./common/head.jspf"%>
<style>
th {
	text-align: center;
	width: 14.28%;
}
</style>
</head>
<body>
	<%@ include file="./common/top.jspf"%>

	<div class="container" style="margin-top: 80px">
		<div class="row">
			<div class="col-4"><%@ include file="./common/aside.jspf"%></div>
			<div class="col-8">
				<!-- main -->
				<div class="container mt-3">
					<h2>DB sample</h2>
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>ID</th>
								<th>Name</th>
								<th>Email</th>
								<th>Address</th>
								<th>Zip-code</th>
								<th>Nationality</th>
								<th>Gender</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="member" items="${memberArray}">
							<tr>
								<td>${member.id}</td>
								<td>${member.name}</td>
								<td>${member.email}</td>
								<td>${member.addr.city}</td>
								<td>${member.addr.zipCode}</td>
								<td>${member.nationality}</td>
								<td>${member.gender}</td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<!-- main -->
			</div>
		</div>
	</div>

	<%@ include file="./common/bottom.jspf"%>
</body>
</html>

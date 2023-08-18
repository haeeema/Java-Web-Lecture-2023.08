<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./common/head.jspf"%>
<style>
td, th {
	text-align: center;
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
					<div class="row">
						<div class="col-1"></div>
						<div class="col-10">
							<h2>DB sample</h2>
							<table class="table table-striped">
								<thead>
									<tr>
										<th>Num</th>
										<th>ID</th>
										<th>Name</th>
										<th>Email</th>
										<th>Address</th>
										<th>Zip</th>
										<th>Nationality</th>
										<th>Gen</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="member" items="${memberArray}" varStatus="loop">
										<tr>
											<td>${loop.count}</td>
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
						<div class="col-1"></div>
					</div>
				</div>
				<!-- main -->
			</div>
		</div>
	</div>

	<%@ include file="./common/bottom.jspf"%>
</body>
</html>

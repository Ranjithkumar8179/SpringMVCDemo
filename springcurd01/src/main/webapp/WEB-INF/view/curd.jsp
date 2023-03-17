<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}
#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}
#customers tr:hover {
	background-color: #ddd;
}
#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>

<a href="./add">RegisteredStudent</a>

<table id="customers">
		<tr>
			<th>Student ID</th>
			<th>Student NAME</th>
			<th>Student FEE</th>
			<!-- 			<th>email</th> -->
			<th>Actions</th>
		</tr>

		<c:forEach var="list" items="${ret}">

			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.fee}</td>
				<td><a href="./delete?id=${list.id}">delete</a></td> 
				<td><a href="./update?id=${list.id}">update</a></td>
			</tr>

		</c:forEach>
	</table>


<%-- ${ret} --%>

</body>
</html>
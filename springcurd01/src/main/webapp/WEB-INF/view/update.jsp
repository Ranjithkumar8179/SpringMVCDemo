<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./pk" method="post">

<label for="id">ID:</label>
<input type="number" name="id" value="${map.id}" readonly="readonly"><br><br>

<label for="name">name:</label>
<input type="text" name="name" value="${map.name}"><br><br>

<label for="fee">fee:</label>
<input type="text" name="fee" value="${map.fee}"><br><br>


<input type="submit" value="enter"><br><br>

</form>
</body>
</html>
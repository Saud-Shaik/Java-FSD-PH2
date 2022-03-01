<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="list"> Click here to view Products</a>

	<form action="AddServlet" method="post">
		
		Name: <input type="text" name="Name"><br /> 
		Price: <input type="text"name="Price"><br /> 
		<input type="submit" value="Save"/>

	</form>

</body>
</html>
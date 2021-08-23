<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User title here</title>
</head>
<body>
<h2> Login name is <%= request.getSession().getAttribute("name") %></h2>
<form action="logout" method="post" >
<input name='<%= request.getSession().getAttribute("name") %>' hidden="true">
<button value="submit" type="submit"> Invalidate the Login</button>
</form>
</body>
</html>
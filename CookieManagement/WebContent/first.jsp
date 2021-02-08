<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<%!int count = 10;%>
	<%
		count++;
	%>
	the counter value is
	<%=count%>;

	<%
		for (int i = 1; i < 7; i++) {
	%>

	<h <%=i%>>Wipro</h<%=i%>>
	<br>
	<%
		}
	%>
</body>
</html>
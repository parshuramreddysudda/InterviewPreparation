<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assignment1</title>
</head>
<body>
	
	<jsp:useBean id="emp" class="EmplyeeBean" />
	
	<% if (request.getParameter("submit") == null) { %>
		<form method="get" action="assignment1.jsp">
			Name: <input type="text" name="name" /><br />
			ID: <input type="text" name="id" /><br />
			<input type="submit" name="submit" />
		</form>
	<% } else { %>
			<jsp:setProperty name="emp" property="name" value='<%=request.getParameter("name")%>' />  
			<jsp:setProperty name="emp" property="id" value='<%=Integer.parseInt(request.getParameter("id"))%>' />
			
			Name: <jsp:getProperty name="emp" property="name"/><br />
			ID: <jsp:getProperty name="emp" property="id"/><br />
			Salary: <jsp:getProperty name="emp" property="salary"/>
	<% } %>
	
	
	
</body>
</html>
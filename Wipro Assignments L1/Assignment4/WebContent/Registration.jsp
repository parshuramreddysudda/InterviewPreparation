<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>Registration Details</title>
</head>
<body>
	<sql:setDataSource var="snapshot"
		driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="root" />
	<sql:query dataSource="${snapshot}" var="result">
         select  * from training
      </sql:query>
	<table border="1" width="100%">
		<tr>
			<th>Emp ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>

				<td><c:out value="${row.trainingid}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.startdate}" /></td>
				<td><c:out value="${row.endate}" /></td>
				<td><c:out value="${row.trainingmode}" /></td>
				<td><c:out value="${row.unit}" /></td>
				<td><c:out value="${row.id}" /></td>
				<td>
					<form action="Register" method="post">
						<input value="${row.trainingid}" name="id" hidden="true">
						<input value="${row.name}" name="name" hidden="true">
						<button type="submit" value="submit">Register</button>
					</form>
				</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>

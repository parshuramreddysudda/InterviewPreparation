<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>Nomination Details</title>
</head>
<body>
	<sql:setDataSource var="snapshot"
		driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="root" />
	<sql:query dataSource="${snapshot}" var="result">
         select  * from registered
      </sql:query>
      <h2>Employee details Registered for </h2>
	<table border="1" width="100%">
		<tr>
			<th>Training ID</th>
			<th>First Name</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

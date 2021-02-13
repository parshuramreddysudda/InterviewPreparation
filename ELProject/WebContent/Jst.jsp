<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title herasde</title>
</head>
<body>
	<c:set var="studentInfo">
		<students> <student> <name>scott</name> <mark>97</mark>
		</student> <student> <name>aasdasf</name> <mark>76</mark> </student> </students>
	</c:set>

	<x:parse xml="${studentInfo}" var="result">
	</x:parse>
	Name =
	<x:out select="$result/students/student[2]/mark" />

	<br>
	<!--  Establish the connection -->


	<sql:setDataSource var="ds" driver="oracle.jdbc.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="root" />

	<sql:query dataSource="${ds}" var="rs">
select * from departments
</sql:query>

	<c:forEach var="rec" items="${rs.rows }">
		<tr>
			<td><c:out value="${rec.DEPARTMENT_NAME}" /></td>
		</tr>


	</c:forEach>
<br>

<c:set var="d" value="<%=new Date() %>"></c:set>
Time:<fmt:formatDate value="${dt }" type="time"/>
</body>
</html>
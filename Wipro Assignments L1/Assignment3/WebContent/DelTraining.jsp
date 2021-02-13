<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*,com.db.util.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table style="width: 100%">
		<tr>
			<th>TrainingID</th>
			<th>TrainingName</th>
			<th>Start Date</th>
			<th>EndDate</th>
			<th>TrainingMode</th>
			<th>BusinisessUnit</th>
			<th>ContactpersonID</th>
		</tr>
			<%
				try {
				DBConnection db = new DBConnection();
				Statement st = db.getDBConnection().createStatement();
				String sql = "SELECT * FROM training";
				ResultSet resultSet;
				resultSet = st.executeQuery(sql);
				while (resultSet.next()) {
				out.print("<form action='DelTraining' methods='post'>");
			%>
		
					<tr>
					<td name="id"><%=resultSet.getString("trainingid")%></td>
					<td><%=resultSet.getString("name")%></td>
					<td><%=resultSet.getString("startdate")%></td>
					<td><%=resultSet.getString("endate")%></td>
					<td><%=resultSet.getString("trainingmode")%></td>
					<td><%=resultSet.getString("unit")%></td>
					<td><%=resultSet.getString("id")%></td>
					<td><button type="submit" value="submit">Delete</button></td>
					</tr>
		
			<%
			out.print("</form>");
				}
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>
		
	</table>
</body>
</html>
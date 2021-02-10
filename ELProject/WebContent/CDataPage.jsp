<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.wipro.bean.Candidatec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		// Candidatec ob=(Candidatec) session.getAttribute("Candidate");
	%>
	using el is ${sessionScope.candidate}


	<c:out value="Hello world" />
	<c:set var="team" value="WiproTeam" scope="session" />
	<c:out value="${team}" />
	<br>
	<c:set var="n1" value="${2*20}" />
	<c:choose>
		  <c:when test="${n1 < 20}">
             N1 is less than 20
        </c:when>
		  <c:when test="${n1 > 20}">
              N1 is less than 50
           </c:when>
		<c:otherwise>
           N1 is not deined
        </c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${n1==40}">
	   works fine
	</c:when>
		<c:otherwise>
         ${n1} records matched your selection.
     </c:otherwise>
	</c:choose>
	
	
	<!--<c:forEach var="i" begin="1" end="10" step="2">
	
	Value i =${i*45}<br/>
	
	</c:forEach>-->
	
	<%
	int[] arr={45,456,235466,457,567,567};
	request.setAttribute("arr", arr);
	%>
	
	<c:forEach var="i" items="${arr}">
	<c:out value="${i}"/>
	</c:forEach>
	asdsadasd

</body>
</html>
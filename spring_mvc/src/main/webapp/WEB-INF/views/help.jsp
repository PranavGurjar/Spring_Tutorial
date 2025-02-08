<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
		<%-- <%
			Integer rollNo = (Integer) request.getAttribute("rollNo");
			String name = (String) request.getAttribute("name");
			LocalDateTime time = (LocalDateTime) request.getAttribute("time");
		%> --%>
		
	<h1>Help Page</h1>
	<p>Welcome to our help page</p>
	<h1>My Name is ${name}<%-- <%=name %> --%></h1>
	<h1>My Roll Number is ${rollNo}<%-- <%=rollNo %> --%> </h1>
	<h1>Date And Time is ${time}<%-- <%=time %> --%></h1>
	<%-- <h1>Date And Time is  <%=time.toString() %> </h1> --%>
	<hr>
	${marks}
	
	<!-- JSTL Expression method -->
	<c:forEach var="item" items="${marks}">
		<%-- <h1>${item}</h1> --%>
		<h1><c:out value="${item}"></c:out></h1>
	</c:forEach>
	
</body>
</html>
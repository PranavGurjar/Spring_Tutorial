<meta charset="UTF-8" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page</h1>
	<p>Hi I Am Pranav Mahajan</p>
	
	<% 
	String name =(String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	
	
	<p>Student Detail : ID: <%=id%> , Name: <%=name%></p>
	<p>Student Detail : ID: <%=id%></p>
	<p>Student Detail : Name: <%=name%></p>
	<p>Student Detail : Name: <%=name%></p>
	
	<p> ArrayList Using Print Friends</p>
	<%
		for(String s : friends){
			out.println(s);
		}
	%> 
	
	<%
		for(String s : friends){
	%>
			<h1><%=s%></h1>
	<%
		}
	%>
	
	
</body>
</html>
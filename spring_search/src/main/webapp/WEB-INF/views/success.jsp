<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Info</title>
</head>
<body>
<h1>${student }</h1>


<h1>${student.name}</h1>
<p>ID: ${student.id}</p>
<p>Date of Birth: ${student.dob}</p>
<p>Courses: ${student.courses}</p>
<p>Gender: ${student.gender}</p>
<p>Type: ${student.type}</p>
<p>Address: ${student.address}</p>
<p>Address Street: ${student.address.street}</p>
<p>Address City: ${student.address.city}</p>
</body>
</html>
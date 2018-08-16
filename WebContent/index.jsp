<%@ page import="com.cg.collectorresume.Resume" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<% Resume resume=(Resume)request.getAttribute("Resume"); %>
<meta charset="ISO-8859-1">
<title>Resume</title>
</head>
<body>
<div>
<%= resume.getFirstName()
%>
<%= resume.getLastName()
%>
<%= resume.getEmail()
%>
<%= resume.getHobbies()
%><br><hr>
</div>
</body>
</html>
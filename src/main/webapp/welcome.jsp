<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String userName="";
	if(session.getAttribute("fname")!=null)
	{
		userName=session.getAttribute("fname").toString();
	}
	else
	{
		response.sendRedirect("login.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%@include file="header.jsp" %>
	<h1 class="text-center mt-3" style="color:#6c757d;padding-bottom:24.7%">Welcome <%= userName %></h1>
<%@include file="footer.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@include file="header.jsp" %>
	<h1 class="text-center mt-3" style="color:#6c757d">Athentification</h1>
	<form action="LoginServlet" method="POST" style="width:60%;margin-left:20%;margin-top:1%;padding-bottom:6.55%" >
  		<div class="mb-3">
    		<label for="exampleInputEmail1" class="form-label">Login Id</label>
    		<input type="text" class="form-control" name="lid">
  		</div>
  		<div class="mb-3">
    		<label for="exampleInputPassword1" class="form-label">Password</label>
    		<input type="password" class="form-control" name="psw">
  		</div>
  		<input type="submit" value="submit" class="btn btn-primary" style="margin-left:45%"><br><br>
	</form>
<%@include file="footer.jsp" %>
</body>
</html>
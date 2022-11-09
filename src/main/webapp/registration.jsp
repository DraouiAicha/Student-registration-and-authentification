<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="css/bootstrap.css"></link>
</head>
<body>
<%@include file="header.jsp" %>

<!-- registration form -->
	<h1 class="text-center mt-3" style="color:#6c757d">Registeration</h1>
	<form action="RegistrationServlet" method="POST" style="width:60%;margin-left:20%;margin-top:1%" >
  		<div class="mb-3">
    		<label for="exampleInputEmail1" class="form-label">First Name</label>
    		<input type="text" class="form-control" name="fname">
  		</div>
  		<div class="mb-3">
    		<label for="exampleInputPassword1" class="form-label">Last Name</label>
    		<input type="text" class="form-control" name="lname">
  		</div>
  		<div class="mb-3">
    		<label for="exampleInputEmail1" class="form-label">Login Id</label>
    		<input type="text" class="form-control" name="lid">
  		</div>
  		<div class="mb-3">
    		<label for="exampleInputEmail1" class="form-label">Password</label>
    		<input type="password" class="form-control" name="psw">
  		</div>
  		<div class="mb-3">
    		<label for="exampleInputEmail1" class="form-label">Date Of Birth</label>
    		<input type="date" class="form-control" name="dob">
  		</div>
  		<div class="mb-3">
    		<label for="exampleInputEmail1" class="form-label">Mobile No</label>
    		<input type="text" class="form-control" name="mobile">
  		</div>
  		<input type="submit" value="submit" class="btn btn-primary" style="margin-left:45%"><br><br>
	</form>
<%@include file="footer.jsp" %>
</body>
</html>
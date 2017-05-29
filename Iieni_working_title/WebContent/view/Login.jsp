<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/bootstrap.css"> 
 		<script type="text/javascript" src="bootstrap.js"></script> 
<title>Log in</title>
</head>
<body>
	<form action="Login" method="post" id="form">
		<label>Username</label>
		<input type="text" placeholder="Enter Username" name="username" required>
		<label>Password</label>
		<input type="password" placeholder="Enter Password" name="password" required>
		<button type="submit" >Log in</button>
	</form>
</body>
</html>
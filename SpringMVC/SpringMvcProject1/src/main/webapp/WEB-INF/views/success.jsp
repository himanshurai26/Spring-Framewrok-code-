<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>

	<h1>This is Success Page</h1>

	<%-- <%
	String name = (String) request.getAttribute("name");
	String email = (String) request.getAttribute("email");
	String password = (String) request.getAttribute("password");
	%>
	
	<h1>My Name is = <%=name %> </h1>
	<h1> My Email id is = <%=email %> </h1>
	<h1> My user encrepted password is = <%= password %> </h1> --%>


	<%-- <h2>Welcome =  ${user.username }</h2>
	<h2>Email id  is = ${user.email }</h2>
	<h2>Password is = ${user.userpassword }</h2> --%>

  <h1 class="text-center">${Header }</h1>
  <h5 class="text-center">${desc }</h5>
  
  <h1 style="color: Blue"> ${msg }</h1>
  <h2 style="color: green">${msg1 }</h2>
  <hr>
  
  
  <h3> My email id is = ${user.email }</h3>
  <h3>My Name is = ${user.username }</h3>
  <h3>My Password is = ${user.userpassword }</h3>
  
  <h5 style="color: green ">${db}</h5>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success page</title>
</head>
<body>
<h1> COMPLEX FORM STUDENTS DETAILS</h1>
<hr>

<h2>Student Name is =  ${student.name }</h2>
<h2>Student Id is = ${student.id }</h2>
<h3> Student Date of birth is = ${date }</h3>
<h3>Course chossen is = ${student.subjects}</h3>
<h3>Student Gender is = ${student.gender }</h3>
<h3>Student Type is = ${student.type }</h3>
<hr>
 <h2>Student Adress is </h2>
<h3> Street is = ${student.address.street }</h3>
<h3>  City is = ${student.address.city }</h3>
<h3> State is = ${student.address.state } </h3>
</body>
</html>
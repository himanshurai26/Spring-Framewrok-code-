<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model and View Page</title>
</head>
<body>
<h1>This is Model And View Page </h1>
<h3>Create By Himanshu Kumar</h3>
<hr>
<h3> Here is the Data</h3>

<%

 String name =(String) request.getAttribute("name");
 Integer id = (Integer) request.getAttribute("id");
  String degree  = (String) request.getAttribute("degree");
 String email = (String) request.getAttribute("email");
%>

<h4>Student name is = <%=name %></h4>
<h4>Student College id is = <%=id %></h4>
<h4> Student Degree is = <%=degree %></h4>
<h4>Student Email id is = <%=email %></h4>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>This is Home Page(View Page)</h1>
<h3><button><a href="modelandview">ModelAndView Page</a></button></h3>
<h4> Taking Data from Controller and display to view page</h4>

<hr>

<%
    
        String name = (String) request.getAttribute("name");
   Integer rollNumber = (Integer) request.getAttribute("roll");
   String className = (String) request.getAttribute("class");
  String cityName = (String) request.getAttribute("city");
  List<String> friend = (List<String>) request.getAttribute("friend");

%>

<h3>Student Name is = <%=name %></h3>
<h3>Student RollNumber is = <%=rollNumber %></h3>
<h3>Student Study in <%=className  %> class</h3>
<h3>Student Home Town is = <%=cityName %></h3>

<% 
  for(String f  : friend){ %>

<h3> His friends Name is = <%= f %> </h3>
  
  <%} %>


</body>
</html>
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

            <h1>${head}</h1>
            <h5>Using HttpServletRequest</h5>
            
            <%
            
        String name = (String) request.getAttribute("name");
         String email = (String) request.getAttribute("email");
          String phone = (String) request.getAttribute("phone");
           String password = (String) request.getAttribute("password");
            
            %>

<h3>Name = ${user.name}</h3>
<h3>Email = ${user.email}</h3>
<h3>Phone =${user.phone }</h3>
<h3> Password =${user.password }</h3>




<hr>

<h3>Created By Himanshu Kumar</h3>
<h5>Himanshu kumar || himanshukr98040@gmail.com</h5>
<hr>

<h5>${footer }</h5> 
</body>
</html>
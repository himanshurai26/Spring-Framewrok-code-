<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="./base.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container mt-3">

<div class="row">
<div class="col-md-12">

<h1 class="text-center mb-3">Welcome to Product Application</h1>


<table class="table table-success table-striped">
  <thead  class="table-dark">
    <tr class="table table-dark table-striped">
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${product }"  var="p">
    <tr>
      <th scope="row">PRODUCT${p.id }</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td class="font-weight-bold"> &#x20B9; ${p.price}</td>
      <td>
      <a href="delete/${p.id }"><i class="fas fa-trash text-danger"  style="font-size: 25px;"></i></a>
      <a href="update/${p.id }"><i class="fas fa-edit text-primary"  style="font-size: 25px;"></i></a>
      </td>
     
    </tr>
    </c:forEach>
  </tbody>
</table>

<div class="container text-center" >
<a href="add_product" class="btn btn-outline-success">Add Product</a>
</div>
</div>
</div>
</div>
</body>
</html>
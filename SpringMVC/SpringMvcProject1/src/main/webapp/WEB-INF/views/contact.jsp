<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Contact form</title>
</head>
<body>

	<div class="container  mt-5 ">
	  <h1 class="text-center">${Header }</h1>
	  <h5 class="text-center"> ${desc}</h5>
	
		<form action="processform" method="post">
			<div class="mb-3">
				<label for="email">Email address</label> <input type="email"
					class="form-control" id="email" name="email" aria-describedby="emailHelp">
			</div>

			<div class="mb-3">
				<label for="username" class="form-label">User Name </label> <input
					type="text" class="form-control" name="username" id="username"
					aria-describedby="emailHelp">
			</div>

			<div class="mb-3">
				<label for="userpassword" class="form-label">User Password </label> <input
					type="password" class="form-control" id="userpassword" name="userpassword"
					aria-describedby="emailHelp">
			</div>
			<div class="container text-center">
			<button type="submit" class="btn btn-success">Sign Up</button>
			</div>
			

		</form>
	</div>









	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>
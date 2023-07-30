<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
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
	
	<link href=" <c:url  value="/resources/css/style.css" />">
	<script src=" <c:url  value="/resources/js/script.js" /> " ></script>

<title>Hello, world!</title>
</head>
<body>

	<div class="container">

		<div class="card mx-auto mt-5 bg-info" style="width: 50%;">
			<div class="card-body py-5">
			<div class="container mt-3">
			<img width="10%" style="display: block; margin: 0 auto; margin-bottom: 40px; border-radius: 50%;" src="<c:url value="resources/images/profile.png" />">
			</div>
				<h3 class="text-center text-white" style="text-transform: uppercase">
					Search Something</h3>
				
				<form  action="search"  class="mt-3">
				<%-- <h4>${msg}</h4>
				<h5>${msg1 }</h5> --%>
					<div class="form-group">
						<input type="text" name="querybox" 
							placeholder="Enter your keywords" class="form-control" />
					</div>

					<div class="container text-center mt-3">
						<button class="btn btn-outline-light">Search</button>
					</div>
				</form>
			</div>
		</div>
	</div>













	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>
</html>
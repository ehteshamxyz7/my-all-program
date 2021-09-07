<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>

	<div class="container mt-5">
		<h3 class="text-center">${Header }</h3>
		<p class="text-center">${Desc }</p>
		
		<form action="processform" method="post">


			<div class="form-group">
				<label for="exampleInputEmail1">Email_address </label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email"
					name="Email_address">
			</div>

			<div class="form-group">
				<label for="userName"">UserName</label> <input type="text"
					class="form-control" id="userName" placeholder="userName"
					name="userName">
			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Enter Password" name="pass">
			</div>
			<div class="container mt-5 text-center">
				<button type="submit" class="btn btn-primary">Submit</button>

			</div>
		</form>
</body>

</html>
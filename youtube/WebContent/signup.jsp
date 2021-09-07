<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP page</title>

<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>


</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">

				<div class="card">
					<div class="card-content"></div>

					<h3 style="margin-top: 10px" class="center-align">Register
						here</h3>

					<div class="form center-align">

						<form action="Register" method="post">
							<input type="email" name="user_email"
								placeholder="Enter user email" /> <input type="password"
								name="user_password" placeholder="Enter user password" />
							<button type="submit" class="btn light-blue accent-3">Submit</button>

						</form>

					</div>

				</div>

			</div>

		</div>

	</div>

	<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>

</body>
</html>
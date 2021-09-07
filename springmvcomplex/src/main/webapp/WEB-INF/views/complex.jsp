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
<body class="container mt-4">

	<div class="row">
		<div class="col-md-8 offset-2">
			<div class="card">
				<div class="card-body">
					<h3 class="text-center">Complex Form</h3>
					<form action="handleform" method="post">
						<div class="form-group">
							<label for="exampleInputEmail">your name</label> <input
								name="name" type="text" class="form-control"
								id="exampleInputEmail1" area-describedy="emailHelp"
								placeholder="Enter Name"> <small id="emailHelp"
								class="form-text text-muted">We'll never share your name
								with anyone alse</small>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">your id</label> <input name="id"
								type="text" class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="Enter ID">
						</div>

						<div class="form-group">
							<label for="exampleImputEmail1">Your DOB</label> <input
								name="date" type="text" class="form-control"
								id=exampleInputEmail1 " placeholder="dd/mm/yy"
								aria-describedby="emailHelp">

						</div>

						<div class="form-group">
							<label for="exampleFormControlSelect1">Select Courses</label> <select
								name="courses" class="form-control"
								id="exampleFormControlSelect1" multiple>
								<option>java</option>
								<option>python</option>
								<option>c++</option>
								<option>Spring Boot</option>
								<option>Spring Framework</option>
							</select>

						</div>

						<div class="form-group">
							<span class="mr-3">Select Gender</span>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inLineRadio1" value="male"> <label
									class="form-check-label" for="inLineRadio1">Male</label>

							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inLineRadio2" value="Female"> <label
									class="form-check-label" for="inLineRadio2">Female</label>

							</div>

						</div>
						<div class="form-group">
							<label for="">Select Type</label> <select class="form-control"
								name="type">
								<option value="old Student">Old Student</option>
								<option value="normalStudent">Normal Student</option>

							</select>

						</div>

						<div class="card">
							<div class="card-body">
								<p>Your address</p>

								<div class="form-group">
									<input name="address.street" type="text" class="form-control"
										placeholder="Enter street" />

								</div>
								<div class="form-group">
									<input name="address.city" type="text" class="form-control"
										placeholder="Enter city" />

								</div>


							</div>

							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
					</form>

				</div>

			</div>

		</div>

	</div>





</body>
</html>
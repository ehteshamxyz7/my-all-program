<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Change product details</h1>

				<form action="${pageContext.request.contextPath}/handle-product" method="post">
				
				<input type="hidden" value="${product.id }" name="id" />
					<div class="form-group">

						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter the product name here"
							value="${product.name }">

					</div>

					<div class="form-group">
						<label for="description"> Production Description</label>
						<textarea class="form-control" name="description" id="description"
							rows="5" placeholder="Enter the product description">${product.description}
							</textarea>

					</div>

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							placeholder="Enter Product Price" name="price"
							class="form-control" id="price" value="${product.price }">

					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline text-danger">Back</a>
						<button type="Submit" class="btn btn-warning">update</button>


					</div>

				</form>

			</div>


		</div>

	</div>

</body>
</html>
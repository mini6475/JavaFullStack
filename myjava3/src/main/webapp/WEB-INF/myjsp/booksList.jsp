<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>PES BookStore</title>
<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<div class="container">
		<h1 class="text-center">Welcome to Java Learning Center !!!</h1>
		<div class="alert alert-danger" role="alert">
			<h2 class="text-center">Latest Books from Suresh Sankar</h2>
		</div>
		<br />
		<table class="table table-striped table-bordered table-hover"
			style="font-size: 20px;">
			<thead class="thead-light ">
				<tr>
					<th>Book Id</th>
					<th>Book Name</th>
					<th>Author</th>
					<th>Price</th>
					<th>Publications</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="mybook" items="${MyBooks}">
					<tr>
						<td><a href="#"> ${mybook.bid} </a></td>
						<td>${mybook.bname}</td>
						<td>${mybook.author}</td>
						<td>${mybook.price}</td>
						<td>${mybook.pub}</td>
						<td>
							<button type="button" class="btn btn-success btn-lg">View
								Book</button>
						</td>
						<td>
							<button type="button" class="btn btn-primary btn-lg">Edit
								Book</button>
						</td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
	</div>
	<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
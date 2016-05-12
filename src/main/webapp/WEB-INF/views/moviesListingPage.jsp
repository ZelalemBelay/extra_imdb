<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie List</title>
</head>
<body>
	<h1>IMDb movies list</h1>
	<br>
	<br>
	<br>
	<br>

	<br>
	<table style= "cellpadding:10px;">

		<thead>
			<tr>
				<th>NAME</th>
				<th>YEAR</th>
				<th>RATING</th>

			</tr>
		</thead>

		<c:forEach var="movie" items="${movieList}">
			<tr>
				<td>${movie.name}</td>
				<td>${movie.year}</td>
				<td>${movie.rating }</td>
				<td><form action="movies/update/${movie.id}" method="get">
						<button>Update</button>
					</form></td>
				<td><form action="movies/delete/${movie.id}" method="post">
						<button type="submit">Delete</button>
					</form></td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<a href="movies/add"> Add Movie</a>
</body>
</html>
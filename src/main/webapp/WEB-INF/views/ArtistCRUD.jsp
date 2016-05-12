<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Artist</title>
</head>
<body>
<h1>IMDb Movie STORE : For Artists </h1>
<h2>${func} Artist</h2>

<form:form modelAttribute = "artist" action="${pageContext.request.contextPath}/artists/add" method="post">
	
	<table>
		<tr>
			<td>NAME :</td>
			<td><form:input path="name" /> </td>
			<td><form:errors path = "name" cssStyle="color:black"/> </td>
		</tr>

		<tr>
			<td>BIRTHDATE:</td>
			<td><form:input path="dob"/> </td>
			<td><form:errors path = "dob" cssStyle="color:black" /> </td>
		</tr>
		<tr>
			<td>BIRTHPLACE:</td>
			<td><form:input path="birthplace" /> </td>
			<td><form:errors path = "birthplace" cssStyle="color:black" /> </td>
		</tr>
		
		
		<tr>
			<td>SUMMERY:</td>
			<td><form:input path="summery" /> </td>
			<td><form:errors path = "summery" cssStyle="color:black"/> </td>
		</tr>
		
		
				
	</table>
	<br>
	<input type="submit" value = "         Add Artist            "/> &nbsp;&nbsp;
	
	</form:form>
	<br>
	<form action="${pageContext.request.contextPath}/artists" method="GET">
						<button>Cancel</button>
					</form>
	
	
</body>
</html>
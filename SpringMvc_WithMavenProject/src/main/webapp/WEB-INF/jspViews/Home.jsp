<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H2>Calculator</H2>
<br>
<form action="add">
	<label for="id">Developer id</label>
	<input type="text" id="devId" name="devId"><br>
	<label for="name">Developer Name</label>
	<input type="text" id="devName" name="devName"><br>
	<label for="fav">Developer fav Tech</label>
	<input type="text" id="favTech" name="favTech"><br>
	<input type="submit" value="Submit"/>
</form>
<br>
<h3>Entered details : ${deve}</h3>
</body>
</html>
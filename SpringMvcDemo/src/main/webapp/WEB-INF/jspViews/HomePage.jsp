<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<h1>inside Home Page</h1>
<h1>Calculator</h1>
<form action="add">
	<label for="num1">Enter 1st number</label>
	<input type="text" id="num1" name="num1"><br>
	<label for="num2">Enter 2nd number</label>
	<input type="text" id="num2" name="num2"><br>
	<input type="submit" value="Submit">
</form>

<h1>Result is <%=session.getAttribute("result")%></h1>
<h5>${a} + ${b} =  ${result}</h5>
<br>
<!-- Using Modelattribute -->
<form action="addDev">
	<label for="id">Enter id</label>
	<input type="text" id="devId" name="devId"><br>
	<label for="name">Enter name</label>
	<input type="text" id="devName" name="devName"><br>
	<input type="submit" value="Submit">
</form>
<br>
<h4>Entered details: ${developer}</h4>
<p>Welcome to the ${course}, Happy Learning</p>
</body>
</html>
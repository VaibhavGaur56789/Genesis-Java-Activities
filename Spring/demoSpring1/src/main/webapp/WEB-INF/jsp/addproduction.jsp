<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "insertProduction" method="post">

Production Number: <input type = "number" name = "pno"><br><br>
Production Name: <input type = "text" name = "pname"><br><br>
Production Address: <input type = "text" name = "paddress"><br><br>
Production Date: <input type = "text" name = "pdate"><br><br>
Production Owner: <input type = "text" name = "powner"><br><br>

<input type = "submit" value = "Add Production">
 
</form>

</body>
</html>
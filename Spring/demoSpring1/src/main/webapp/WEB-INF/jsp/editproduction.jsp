<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "updateProduction" method = "post">

Production Number: <input type = "hidden" name = "pno" value = "${production.getProductionid() }"><br><br>
Production Name: <input type = "text" name = "pname" value = "${production.getProductionname() }"><br><br>
Production Address: <input type = "text" name = "paddress" value = "${production.getAddress() }"><br><br>
Production Date: <input type = "text" name = "pdate" value = "${production.getDateofstart() }"><br><br>
Production Owner: <input type = "text" name = "powner" value = "${production.getOwnername() }"><br><br>

<input type = "submit" value = "Update Production">

</form>

</body>
</html>
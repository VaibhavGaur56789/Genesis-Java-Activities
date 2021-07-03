<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "insertMovie" method="post">


Movie Name: <input type = "text" name = "mname"><br><br>
Movie Cast1 (Actor): <input type = "text" name = "cast1"><br><br>
Movie Cast2 (Actress): <input type = "text" name = "cast2"><br><br>
Movie Type: <input type = "text" name = "mtype"><br><br>

Release Date: <input type = "date" name = "mdate"><br><br>


<input type = "submit" value = "Add Movie">

</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ page import = "com.ltts.prod.dao.*, com.ltts.prod.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Production Edit</h1>
<%
ProductionDao pd= new ProductionDao();
int id = Integer.parseInt(request.getParameter("id"));
Production p = pd.getProductionById(id);
%>
<form action = "./updateProductionServlet" method="post">
<input type="hidden" name="pid" value="<%=id%>"><br><br>
Production Name: <input type="text" name="pname" value="<%=p.getProductionname() %>"><br><br>
Address: <input type="text" name="paddress" value="<%=p.getAddress() %>"><br><br>
Date of Start: <input type="text" name="pdate" value="<%=p.getDateofstart() %>"><br><br>
Owner Name: <input type="text" name="powner" value="<%=p.getOwnername() %>"><br><br>
<input type="submit" value="Update Player"><br> 
</form>
</body>
</html>
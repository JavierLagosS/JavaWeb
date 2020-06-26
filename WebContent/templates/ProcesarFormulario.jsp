<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<%= request.getParameter("nombre") %></br>
	<%= request.getParameter("apellido") %></br>
	<%= request.getParameter("telefono") %></br>
	<%= request.getParameter("cargo") %></br>
	<%= request.getParameter("direccion") %></br>
	<%= request.getParameter("ciudad") %></br>
	<%= request.getParameter("fechaN") %></br>
	<%= request.getParameter("sexo") %></br>
	<%= request.getParameter("previsional") %></br>
	<%= request.getParameter("text") %></br>
</body>
</html>
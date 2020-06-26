<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<Form action="Solicitud" method="post">
	<input type ="submit" name="accion" value="listar">

		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Rut</th>
					<th>Ciudad</th>
					<th>Email</th>
					<th>Telefono</th>
				</tr>
			</thead>
			<tbody>

				<tr>
					<td><%=request.getParameter("ID")%></td>
					<td><%=request.getParameter("NOMBRE")%></td>
					<td><%=request.getParameter("APELLIDO")%></td>
					<td><%=request.getParameter("RUT") %></td>
					<td><%=request.getParameter("CIUDAD")%></td>
					<td><%=request.getParameter("EMAIL")%></td>
					<td><%=request.getParameter("TELEFONO")%></td>
				</tr>


	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

<form action="controlador" method="post">
<input type ="submit" name="accion" value="listar">
<input type ="submit" name="accion" value="Agregar">
</form>


<table border="1">

<thead> 
<tr>
<th>ID</th>
<th>NOMBRES</th>


</tr>
</thead>
<tbody>

<c:forEach var="datos" items="${datos}">
<tr>
<td>${datos.getId()}</td>
<td>${datos.getNom()} </td>


</tr>

</c:forEach>



</tbody>
</table>




</div>
</body>
</html>

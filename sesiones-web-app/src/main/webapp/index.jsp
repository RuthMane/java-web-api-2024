<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clase 2 - Java WebApi</title>
</head>
<body>
<!-- Me da el nombre del contexto -->
<form
method= "get"
action="<%=request.getContextPath()%>/api/producto">
<input type="hidden" name="id" value="1"/>

<button>
Consultar
</button>

</form>
</body>
</html>
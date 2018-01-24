<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Mascota"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Mascota mascota = (Mascota)request.getAttribute("mascota");%>
<form action="__SaveController?id=<%= mascota.getId() %>" method="POST">
<input type="text" name="nombre" value="<%= mascota.getName() %>" placeholder="Nombre"/><br>
<input type="number" name="edad" value="<%= mascota.getEdad() %>" placeholder="Edad"/><br>
<p>Descripción</p>
<textarea type="text" name="descripcion"><%= mascota.getDescripcion() %></textarea><br>
<input type="submit" value="GUARDAR"/>
</form>
</body>
</html>
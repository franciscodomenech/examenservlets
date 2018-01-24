<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Mascota,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><form action="__ListController" method="GET"><input type="text" name="valuesearchin" value="<%= request.getAttribute("valuesearch") %>"/><input type="submit" value="BUSCAR" /></form></p>
<table>
<thead>
<tr><th>Nombre</th><th>Edad</th><th>Acciones</th></tr>
</thead>
<tbody>
<% 
List<Mascota> mascotas = (List<Mascota>)request.getAttribute("mascotas");
for(int i=0;i<mascotas.size();i++){
	Mascota m = mascotas.get(i);
%>
<tr>
	<td><%= m.getName() %></td><td><%= m.getEdad() %></td>
	<td><a href="__RemoveController?id=<%= m.getId() %>">ELIMINAR</a><a href="__FichaController?id=<%= m.getId() %>">VER</a></td><td></td>
</tr>
<% } %>
</tbody>
</table>
<p><a href="__FichaController">AÑADIR</a></p>
</body>
</html>
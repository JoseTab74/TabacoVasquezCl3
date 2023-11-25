<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="model.TblProductocl3" %>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body bgcolor="#FBFCFC">
<div color="#641E16">
<h1 align="center" style="color:#17202A;">Listado de Productos</h1>
<h1 align="center" style="color:#17202A"><a href="ControladorProducto?accion=registrar" style="text-decoration: null">Registrar Producto</a></h1>


</div>
<table align="center" border="1"  bgcolor="#D6EAF8" >

<tr style="color:#004DFF">
<th>Codigo</th>
<th>Nombre</th>
<th>PrecioVenta</th>
<th>Stock</th>
<th>PrecioComp</th>
<th>Estado</th>
<th>Descripcion</th>
</tr>
<%
List<TblProductocl3> listar=(List<TblProductocl3>)request.getAttribute("listado");
//aplicamos
for(TblProductocl3 lis:listar){
	//aplicamos una cndicion
	if(lis!=null){
		%>
		<tr>
		<td><%=lis.getIdproductocl3()%></td>
		<td><%=lis.getNombrecl3() %></td>
		<td><%=lis.getPrecioventacl3() %></td>
		<td><%=lis.getStock() %></td>
		<td><%=lis.getPreciocompcl3() %></td>
		<td><%=lis.getEstadocl3() %></td>
		<td><%=lis.getDescripcl3() %></td>
		</tr>
		
		<% 
	}//fin del if
	
}//Fin del bucle

%>

</table>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar</title>
</head>
<body bgcolor="#FBFCFC">

<h1 align="center">Registrar Producto</h1>

<form action="ControladorProducto" method="post">

<table align="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precioventa</td>
<td><input type="text" name="precio"></td>
</tr>
<tr>
<td>stock</td>
<td>
<input type="text" name="stock">
</td>
</tr>

<tr>
<td>PrecioCompra</td>
<td><input type="text" name="preciocomp"></td>
</tr>


<!--
<tr>
<td>Precio</td>
<td><input type="text" name="precio"></td>
</tr>
-->
<tr>
<td>Estado</td>
<td><input type="text" name="estado"></td>
</tr>

<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion"></td>
</tr>


<tr>
<td colspan="2">
<input type="submit" value="Registrar Producto">
</td>
</tr>
</table>

</form>


</body>
</html>
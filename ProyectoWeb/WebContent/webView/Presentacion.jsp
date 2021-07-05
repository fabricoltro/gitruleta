<%@page import="ar.com.utn.ruleta.modelo.Jugador"%>
<%@page import="view.presentacionFactory.PresentacionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" -->
  <title>presentación CRUD Jugadores</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container p-3 my-3 bg-dark text-white">
<h2> Esta es la presentacion del sistema de ruleta</h2>
</div>


<form action='http://localhost:8081/ProyectoWeb/JugadoresControlller' method ='get'>
<%
	String strIdioma = application.getInitParameter("idioma");
	System.out.println("idioma=" + strIdioma);
	//Como  deberia ser
	//1- cuando entro por primera vez no tengo accion
	// tengo codigo , nombre , apelldio alias y las opciones agregar y buscar (botones)
	// supongamos que elijo buscar
	// - controller, busca y me muestra el listado acompañado de los los links modificar, eliminar 
	// vuelve  a presentacion con los parametros llenos listos para modiciar
	//********realizar un patron de diseño Factory PresentacionFactory.gatInstance(juador, accion)
	// - si la acion es ninguna punto 1
	// - si es moficar debe competarse con los datos del Jugador
	Jugador jug = new Jugador(request.getParameter("codigo")==null?0:Integer.parseInt(request.getParameter("codigo").trim()),
								request.getParameter("nombre"), 
								request.getParameter("apellido"), 
								request.getParameter("alias"));
	String accion = request.getParameter("accion");
	PresentacionFactory presentacion = PresentacionFactory.getInstance(jug, accion); 
%>
	<%=presentacion.getCampos() %>
	<%=presentacion.getBotones() %>

</form>

</body>
</html>
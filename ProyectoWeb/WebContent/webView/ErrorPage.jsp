<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="webView/Page.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		
</head>

	<header>
	<%  //TODO Fer EN EL JSP hay que dejarlo igual de lindo que el resto --%>
	<div class="container p-3 my-3 bg-dark text-white">
		<h1>Hubo un error al agregar al jugador</h1>
	</div>
	<div class="container p-3 my-3 bg-dark text-white">
		<%= request.getAttribute("error") %>
	</div>
	</header>
<body>
	<p id="body1">Para ir a inicio haga click en inicio <a href ="http://localhost:8081/ProyectoWeb/webView/Presentacion.jsp">inicio</a>
</body>
</html>
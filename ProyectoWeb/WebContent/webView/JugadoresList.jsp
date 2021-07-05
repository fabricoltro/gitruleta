<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import=" ar.com.utn.ruleta.modelo.Jugador" %>
<%@page import="java.util.List"          %>   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Listado de jugadores</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
   
<% List<Jugador> jugadores = (List<Jugador>)request.getAttribute("jugadores");%>
			<div class="container">
  				<h2>Listado de jugadores</h2>    
				<TABLE class="table" width="100%">
				   <thead>
      				<tr>
						<TH>codigo</TH><TH>nombre</TH><TH>apellido</TH><TH>alias</TH><TH>modificar</TH><TH>eliminar</TH><TH>ver</TH>
			      	</tr>
    			  </thead>
				  <tbody>		
		<%for (Jugador jugador : jugadores) {%>
					<tr class="table-active">>		
					<TD><%=jugador.getCodigo()%></TD>					
					<TD><%= jugador.getNombre()%></TD>
					<TD><%=jugador.getApellido()%>	</TD>
					<TD><%=jugador.getAlias()%>	</TD>
					<%-- aca hay que agregar dos diviciosnes una con un href a modiicar  --%>
					<%--2 y 3 este es el machete edel href   ****  <a href ="http://localhost:8081/ProyectoWeb/webView/Presentacion.jsp">acá</a> --%>
					<%-- hay que agregar para el caso de modicar accion, codigo, nombre, apellido y alias y para de elimimnar accion y codigo  --%>
					<TD><a href ="http://localhost:8081/ProyectoWeb/webView/Presentacion.jsp
										?accion=modificar&
										codigo=<%=jugador.getCodigo()%>&
										nombre=<%=jugador.getNombre()%>&
										apellido=<%=jugador.getApellido()%>&
										alias=<%=jugador.getAlias()%>
										">modificar</a></TD>
					<TD><a href ="http://localhost:8081/ProyectoWeb/webView/Presentacion.jsp
										?accion=eliminar&
										codigo=<%=jugador.getCodigo()%>&
										nombre=<%=jugador.getNombre()%>&
										apellido=<%=jugador.getApellido()%>&
										alias=<%=jugador.getAlias()%>		
										">eliminar</a></TD>
					<TD><a href ="http://localhost:8081/ProyectoWeb/webView/Presentacion.jsp
										?accion=ver&
										codigo=<%=jugador.getCodigo()%>&
										nombre=<%=jugador.getNombre()%>&
										apellido=<%=jugador.getApellido()%>&
										alias=<%=jugador.getAlias()%>		
										">ver</a></TD>
				</tr>
			<% }%>
			</tbody>
			</TABLE>
			</div>		
		<p id="body1">Para ir a inicio haga click aqui <a href ="http://localhost:8081/ProyectoWeb/webView/Presentacion.jsp">inicio</a>
</body>
</html>
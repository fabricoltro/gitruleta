package view.presentacionFactory;

public class VerPresentacionFactory extends PresentacionFactory {

	public VerPresentacionFactory() {
		// TODO Fabri agregarle onda
	}

	@Override
	public boolean isMe() {

		return accion!=null && accion.toLowerCase().equals("ver");		
	}

	/**
	 *
	 */
	@Override
	public String getCampos() {
		//TODO fabri quiero que se vea el codigo
		StringBuffer sb = new StringBuffer("<div class=\"container\">");
						sb.append("<table class=\"table table-dark table-striped\">");
						
						sb.append("<tr>");
					 		sb.append("<td>");
								sb.append("NOMBRRE : ");
								sb.append(jugador.getNombre());
								sb.append("<br>");
							sb.append("</td>");
						sb.append("</tr>");
						//y asi continua
						sb.append("<tr>");
				 			sb.append("<td>");
								sb.append(" APELLIDO : ");
				                sb.append(jugador.getApellido());
				                sb.append("<br>");
				            sb.append("</td>");
						sb.append("</tr>");
		                
						sb.append("<tr>");
				 			sb.append("<td>");
				                sb.append("ALIAS : ");
				                sb.append(jugador.getAlias());
				                sb.append("<br>");
				            sb.append("</td>");
						sb.append("</tr>");
		                
						sb.append("<tr>");
			 				sb.append("<td>");
				                sb.append("CODIGO : ");
				                sb.append(jugador.getCodigo());
				                sb.append("<br>");
		                	sb.append("</td>");
						sb.append("</tr>");
						sb.append("</table>");
		                
		//se deberan mostrar todos los campos con label y los datos del jugador
		//1-nombre : + jugador.getNombre()
		//2-apellido : + jugador.getApellido()
		//3-alias : + jugador.getAlias()
		
		return sb.toString();
	}

	@Override
	public String getBotones() {
			 StringBuffer sb = new StringBuffer("<p id=\"body1\">Para ir a inicio"
			 		+ " haga click en inicio ");

			 sb.append("<a href =\"http://localhost:8081/ProyectoWeb"
			 		   + "/webView/Presentacion.jsp\">inicio</a>");
			 
			 sb.append("</div>");
	
			// con  sb.append( agregar todo el resto...	
			// con  sb.append( agregar todo el resto...
			// con  sb.append( agregar todo el resto...	
			// con  sb.append( agregar todo el resto...	
				// con  sb.append( agregar todo el resto...	
		return sb.toString();
	}

}
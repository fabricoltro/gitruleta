package view.presentacionFactory;

public class ModificarPresentacionFactory extends PresentacionFactory {

	public ModificarPresentacionFactory() {	}

	@Override
	public boolean isMe() {
		
		return accion!=null && accion.toLowerCase().equals("modificar");
	}

	@Override
	public String getCampos() {
		//los mismo campos que en el agregar pero con valores...
		//TODO FER...
		StringBuffer sb = new StringBuffer("<div class=\"container\">");
								 sb.append("<table class=\"table table-dark table-striped\">");
								 
								 sb.append("<tr>");
								 	sb.append("<td>");
								 	sb.append("CODIGO:");
								 	sb.append("</td>");
								 	
								 	sb.append("<td>");
								 	sb.append(jugador.getCodigo());
								 	sb.append("</td>");
								 sb.append("</tr>");
								
								 sb.append("<tr>");
								 	sb.append("<td>");		
								 	sb.append("NOMBRE:");
								 	sb.append("</td>");
								 	
								 	sb.append("<td>");
								 //comienza el input************************************
								 	sb.append("<input id='nombre' name='nombre' value='");															
								 	sb.append(jugador.getNombre());						
								 	sb.append("'/>");
						         //termina el input ********************************
								 	sb.append("</td>");
								 sb.append("</tr>");
								 	
								 	
								 sb.append("<tr>");
								 	sb.append("<td>");
								 	sb.append("APELLIDO : ");
								 	sb.append("</td>");
								 	
								 	sb.append("<td>");
								 	sb.append("<input id='apellido' name='apellido' value='");
								 	sb.append(jugador.getApellido());
								 	sb.append("'/>");
								 	sb.append("</td>");
								 sb.append("</tr>");
						        
								 
								 sb.append("<tr>");
								 	sb.append("<td>");
								 	sb.append("ALIAS : ");
								 	sb.append("</td>");
								 	
								 	sb.append("<td>");
								 	sb.append("<input id='alias' name='alias' value='");
								 	sb.append(jugador.getAlias());
								 	sb.append("'/>");
						         	sb.append("<br>");
						         sb.append("</tr>");
						         sb.append("</table>");
								 	
						         sb.append("<div class=\"container p-3 my-3 bg-dark text-white\">");
								 	
						         sb.append("<h2>�Desea modificar? </h2>");
						         sb.append("</div>");
						        
						         
						         sb.append("<input type ='hidden' id='codigo' name='codigo' value='");
						         sb.append(jugador.getCodigo());
						         sb.append("'/>");
						         
		//se deberan mostrar todos los campos con input type text y los datos del jugador
		//1-nombre : + jugador.getNombre()
		//2-apellido : + jugador.getApellido()
		//3-alias : + jugador.getAlias()
	
		return sb.toString();
	}

	@Override
	public String getBotones() {
		//TODO fer si responde si la accion debe ser modificar 
		StringBuffer sb = new StringBuffer("<div class=\"container\">");
								 sb.append("<table class=\"table table-dark table-striped\">");
								 sb.append("<tr>");	
						         sb.append("<td> <input type='radio' id='Modificar' name='accion' value='Modificar'> </td> <td>Si</td>");
						         sb.append("</tr>");
						         sb.append("<tr>");
								 sb.append("<td> <input type='radio' id='Principal' name='accion' value='Buscar'> </td> <td>No</td>");			
								 sb.append("</tr>");
								 sb.append("</table>");
								 sb.append(" <div class=\"container p-3 my-3 bg-dark text-white\"><input type='submit'class=\"btn btn-info\" value ='accion'></div>");
						
		
		//1-un option button que diga a través de un label modificar con nombre = accion y valor  modificar.
		//2-un option button que diga a través de un label inicio con un label con nombre = '' (vacio) y valor '' vacio.
		//3- un boton submit
		
		return sb.toString();
	}

}

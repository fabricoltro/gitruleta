package view.presentacionFactory;

public class EliminarPresentacionFactory extends PresentacionFactory {

	public EliminarPresentacionFactory() {}

	@Override
	public boolean isMe() {		
		return accion!=null && accion.toLowerCase().equals("eliminar");
}

	@Override
	public String getCampos() {
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
					 	  sb.append(jugador.getNombre());
					 	  sb.append("</td>");
						sb.append("</tr>");
						
						//y asi continua	
						
						sb.append("<tr>");
					 	  sb.append("<td>");
						  sb.append("APELLIDO : ");
						  sb.append("</td>");
						  
						  sb.append("<td>");
		                  sb.append(jugador.getApellido());
		                  sb.append("</td>");						
						sb.append("</tr>");
		                 
						sb.append("<tr>");						
						  sb.append("<td>");
		                  sb.append("ALIAS : ");
		                  sb.append("</td>");
		                
		                  sb.append("<td>");
		                  sb.append(jugador.getAlias());
		                  sb.append("</td>");		                  
		                sb.append("</tr>");
		                                		                		                		                	               		                						  		               		               	               
		                sb.append("</table>");		                
		                sb.append("</div>");		                
		                sb.append("<div class=\"container p-3 my-3 bg-dark text-white\">");		                
		                sb.append("�Desea Eliminar? ");
		                sb.append("</div>");
		                
		                //aca valo valores que deben viajar		                
		             	sb.append("<input type ='hidden' id='codigo' name='codigo' value='");
		             	sb.append(jugador.getCodigo());
		             	sb.append("'/>");
		                 
		             	sb.append("<input type ='hidden' id='nombre' name='nombre' value='");
		             	sb.append(jugador.getNombre());
		             	sb.append("'/>");
		             	
		             	sb.append("<input type ='hidden' id='apellido' name='apellido' value='");
		             	sb.append(jugador.getApellido());
		             	sb.append("'/>");
		             		             			            
		             	sb.append("<input type ='hidden' id='alias' name='alias' value='");
		             	sb.append(jugador.getAlias());
		             	sb.append("'/>");
		            	
		                
		                
		//se deberan mostrar todos los campos con label y los datos del jugador
		//1-nombre : + jugador.getNombre()
		//2-apellido : + jugador.getApellido()
		//3-alias : + jugador.getAlias()
		//4- otro label que diga "desaa eliminar""
		return sb.toString();
	}

	@Override
	public String getBotones() {
		//TODO fabril hacer esto adentro de un div copialo del agregars
		StringBuffer sb = new StringBuffer("<div class=\"container\">");
		sb.append("<table class=\"table table-dark table-striped\">");
		sb.append("<tr>");
		sb.append("<td> <input type='radio' id='Eliminar' name='accion' value='Eliminar'> </td> <td>Si</td>");		
		 sb.append("</tr>");
		 sb.append("<tr>");
		 sb.append("<td> <input type='radio' id='Principal' name='accion' value='Buscar'> </td> <td>No</td>");
		 sb.append("</tr>");
		 sb.append("<tr>");
		 sb.append("</table>");
		 sb.append(" <div class=\"container p-3 my-3 bg-dark text-white\"><input type='submit'class=\"btn btn-info\" value ='accion'></div>"); 		
		

         	
		
		//1-un option button que diga a través de un label si con nombre= accion  y valor = eliminar.
		//2-un option button que diga a través de un label no con accion '' (vacio) y valor ´' vacio.
		//3- un boton submit
         	
		return sb.toString();
	}

}

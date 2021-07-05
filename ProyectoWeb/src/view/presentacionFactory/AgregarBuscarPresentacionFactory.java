package view.presentacionFactory;

public class AgregarBuscarPresentacionFactory extends PresentacionFactory {

	public AgregarBuscarPresentacionFactory() {}

	@Override
	public boolean isMe() {
		return accion==null || accion.isEmpty();
	}

	@Override
	public String getCampos() {
		StringBuffer sb = new StringBuffer("<div class=\"container\">");
								 sb.append("<table class=\"table table-dark table-striped\">");
								 sb.append("<tr>");		
								 sb.append("<td> NOMBRRE :</td> <td> <input type ='text' name='nombre'/> </td>");
								 sb.append("</tr>");
								 sb.append("<td> APELLIDO : </td> <td> <input type ='text' name='apellido'/><td>");
								 sb.append("<tr>");
								 sb.append("<td> ALIAS     : </td> <td> <input type ='text' name='alias'/><td>");
								 sb.append("</tr>");
								 sb.append("<br>");
								 sb.append("<table>");								 
								 sb.append("</div>");								 
	//<div class="container p-3 my-3 bg-dark text-white"></div>							 
		
		return sb.toString();
	}

	@Override
	public String getBotones() {
		
		StringBuffer sb = new StringBuffer("<div class=\"container p-3 my-3 bg-dark text-white\">");
							     sb.append("<input type=\"radio\" id=\"Agregar\" name=\"accion\" value=\"Agregar\">");
		 						 sb.append("<label for=\"Agregar\">Agregar</label><br>");
		 						 sb.append("<input type=\"radio\" id=\"Buscar\" name=\"accion\" value=\"Buscar\">");
		 						 sb.append("<label for=\"Buscar\">Buscar</label><br>");
		 						 sb.append("<input type='submit'class=\"btn btn-info\" value ='accion'>");
		 						 sb.append("</div>");
		 						 
	return sb.toString();
	}

}

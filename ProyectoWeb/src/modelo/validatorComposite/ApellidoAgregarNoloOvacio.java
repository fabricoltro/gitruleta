package modelo.validatorComposite;

public class ApellidoAgregarNoloOvacio extends ValidatorComposite {

	public ApellidoAgregarNoloOvacio() {
	}

	@Override
	public boolean isMe() {
		return 	(accion == AGREGAR 		|| accion == MODIFICAR)					&&
				(jugador.getApellido() == null || jugador.getApellido().isEmpty())	;
	}

	@Override
	public String getError() {		
		return "El apellido no puede estar vacío o Nulo";
	}

}

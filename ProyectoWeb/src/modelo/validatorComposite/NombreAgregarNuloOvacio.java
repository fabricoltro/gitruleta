package modelo.validatorComposite;

public class NombreAgregarNuloOvacio extends ValidatorComposite {

	public NombreAgregarNuloOvacio() {
	}

	@Override
	public boolean isMe() {		
		return 	(accion == AGREGAR 		|| accion == MODIFICAR)					&&
				(jugador.getNombre() == null || jugador.getNombre().isEmpty())	;
	}

	@Override
	public String getError() {
		return "El nombre no puede estar vacío o Nulo";
	}

}

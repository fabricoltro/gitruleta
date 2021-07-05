package modelo.validatorComposite;

public class AliasAgregarNuloOVacio  extends ValidatorComposite{

	public AliasAgregarNuloOVacio() {
		
	}

	@Override
	public boolean isMe() {
		return 	(accion == AGREGAR 		|| accion == MODIFICAR)					&&
				(jugador.getAlias() == null || jugador.getAlias().isEmpty())	;
	}

	@Override
	public String getError() {
		return "El alias no puede estar vacío o Nulo";
	}

}

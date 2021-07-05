package modelo.validatorComposite;

public class CodigoMenorAceroOIgualACero extends ValidatorComposite {

	@Override
	public boolean isMe() {		
		return 	(accion == ELIMINAR		|| accion == MODIFICAR)					&&
				(jugador.getCodigo() < 0 || jugador.getCodigo() == 0) ;
	}

	@Override
	public String getError() {
		return "El codigo debe ser mayor que cero ";
	}

}
package modelo.validatorComposite;

import java.util.ArrayList;
import java.util.List;


import ar.com.utn.ruleta.modelo.Jugador;

public abstract class ValidatorComposite {
	public static final int AGREGAR 	= 0	;
	public static final int MODIFICAR 	= 1	;
	public static final int ELIMINAR 	= 2	;
	
	protected static Jugador 		jugador	;
	protected static int 			accion	;
	
	public ValidatorComposite() {}

	public static String getErrores(Jugador pJugador, int pAccion){
		jugador = pJugador	;
		accion  = pAccion	;
		StringBuffer errores = new StringBuffer();
		List<ValidatorComposite> validators = new ArrayList<ValidatorComposite>();
		validators.add(new CodigoMenorAceroOIgualACero());
		validators.add(new NombreAgregarNuloOvacio());
		validators.add(new ApellidoAgregarNoloOvacio());
		validators.add(new AliasAgregarNuloOVacio());
		
		for (ValidatorComposite validatorComposite : validators) {
			if(validatorComposite.isMe()){
				errores.append(validatorComposite.getError());
				errores.append("<br>");				
			}
		}
		
		
		
		return errores.toString();
	}
	
	public abstract boolean isMe();
	public abstract String getError();
	
}

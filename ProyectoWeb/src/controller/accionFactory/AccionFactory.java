package controller.accionFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ar.com.utn.ruleta.modelo.Jugador;
import ar.com.utn.ruleta.modelo.exceptions.RuletaException;
public abstract class AccionFactory {
	protected static String accion;
	protected static Jugador jugador;
	protected static List<Jugador> jugadores;
	
	public static AccionFactory getInscante(String pAccion, Jugador pJugador){
		accion = pAccion;
		jugador = pJugador;
		
		List<AccionFactory> acciones = new ArrayList<AccionFactory>();		
		acciones.add(new AgregarFactory());		
		acciones.add(new ModificarFactory());
		acciones.add(new EliminarFactory());
		acciones.add(new BuscarAccion());
		
		for (AccionFactory accionFactory : acciones) {
			if(accionFactory.isMe())
				return accionFactory;
		}
		return null;
	}
	
	public abstract boolean isMe();	
	public abstract void execute() throws ClassNotFoundException, SQLException, RuletaException;
	
	public static List<Jugador> getJugadores(){	return jugadores;
	}
	
}

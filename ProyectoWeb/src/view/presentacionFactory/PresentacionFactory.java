package view.presentacionFactory;

import java.util.ArrayList;
import java.util.List;

import ar.com.utn.ruleta.modelo.Jugador;

public abstract class PresentacionFactory {
	protected static Jugador jugador;
	protected static String accion;
	
	public PresentacionFactory() {}
	public static PresentacionFactory getInstance(Jugador pJug, String pAccion){
		jugador = pJug;
		accion = pAccion;
		
		List<PresentacionFactory> presentaciones = new ArrayList<PresentacionFactory>();
		presentaciones.add(new AgregarBuscarPresentacionFactory());
		presentaciones.add(new EliminarPresentacionFactory());
		presentaciones.add(new ModificarPresentacionFactory());
		presentaciones.add(new VerPresentacionFactory());
		
		for (PresentacionFactory presentacionFactory : presentaciones) {
			if(presentacionFactory.isMe())
				return presentacionFactory;
			
		}
		
		return null;
	}
	
	public abstract boolean isMe();
	public abstract String getCampos();
	
	public abstract String getBotones();

}

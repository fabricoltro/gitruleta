package controller.accionFactory;

import java.sql.SQLException;
import java.util.List;

import ar.com.utn.ruleta.dao.JugadorDao;
import ar.com.utn.ruleta.modelo.Jugador;
import ar.com.utn.ruleta.modelo.exceptions.RuletaException;
import modelo.validatorComposite.ValidatorComposite;

public class AgregarFactory extends AccionFactory {

	@Override
	public boolean isMe() {		
		return accion.toLowerCase().equals("agregar");
	}

	@Override
	public void execute() throws ClassNotFoundException, SQLException, RuletaException {		
		JugadorDao jugDao = new JugadorDao();
		String strErrores= ValidatorComposite.getErrores(jugador, ValidatorComposite.AGREGAR);
		if(strErrores.isEmpty())
			jugDao.agregar(jugador);
		else
			throw new RuletaException(strErrores);
		
		jugadores = jugDao.leer(null);
	}


}

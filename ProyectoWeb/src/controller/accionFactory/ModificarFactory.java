package controller.accionFactory;

import java.sql.SQLException;
import java.util.List;

import ar.com.utn.ruleta.dao.JugadorDao;
import ar.com.utn.ruleta.modelo.Jugador;
import ar.com.utn.ruleta.modelo.exceptions.RuletaException;
import modelo.validatorComposite.ValidatorComposite;

public class ModificarFactory extends AccionFactory {

	@Override
	public boolean isMe() {
		// TODO Fabri
		return accion.toLowerCase().equals("modificar");
	}

	@Override
	public void execute() throws ClassNotFoundException, SQLException, RuletaException {	
		
		JugadorDao jugDao = new JugadorDao();
		String strErrores= ValidatorComposite.getErrores(jugador, ValidatorComposite.MODIFICAR);
		if(strErrores.isEmpty())
			jugDao.modificar(jugador);
		else
			throw new RuletaException(strErrores);
		
		jugadores = jugDao.leer(null);
		//1- crea el dao
		//2- valida
		//3. modifica o lanza la excepcion

	}


}

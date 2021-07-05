package controller.accionFactory;

import java.sql.SQLException;

import ar.com.utn.ruleta.dao.JugadorDao;
import ar.com.utn.ruleta.modelo.exceptions.RuletaException;
import modelo.validatorComposite.ValidatorComposite;

/**
 * @author FerMa
 * Perminte realizar la accion de eliminar un jugador
 *
 */
public class EliminarFactory extends AccionFactory {

	@Override
	public boolean isMe() {
		
		return accion.toLowerCase().equals("eliminar");
	}

	@Override
	public void execute() throws ClassNotFoundException, SQLException, RuletaException {

		JugadorDao jugDao = new JugadorDao();
		String strErrores= ValidatorComposite.getErrores(jugador, ValidatorComposite.ELIMINAR);
		if(strErrores.isEmpty())
			jugDao.eliminar(jugador);
		else
			throw new RuletaException(strErrores);
		jugadores = jugDao.leer(null);
	}


}

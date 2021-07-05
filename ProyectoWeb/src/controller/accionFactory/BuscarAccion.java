package controller.accionFactory;

import java.sql.SQLException;
import java.util.List;

import ar.com.utn.ruleta.dao.JugadorDao;
import ar.com.utn.ruleta.modelo.Jugador;

public class BuscarAccion extends AccionFactory {

	@Override
	public boolean isMe() {
		return accion.toLowerCase().equals("buscar");
	}

	@Override
	public void execute() throws ClassNotFoundException, SQLException {
		
		JugadorDao jugDao = new JugadorDao();
		jugadores = jugDao.leer(jugador);

	}




}

package view.presentacionFactory.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ar.com.utn.ruleta.modelo.Jugador;
import controller.accionFactory.ModificarFactory;
import view.presentacionFactory.AgregarBuscarPresentacionFactory;
import view.presentacionFactory.EliminarPresentacionFactory;
import view.presentacionFactory.ModificarPresentacionFactory;
import view.presentacionFactory.PresentacionFactory;
import view.presentacionFactory.VerPresentacionFactory;

public class PresentacionFactoryTest {
	Jugador jugador;

	@Before
	public void setUp() throws Exception {
		jugador = new Jugador("Gabriel", "Casas", "El Jedi");
	}

	@After
	public void tearDown() throws Exception {
		jugador = null;
	}

	@Test
	public void testGetInstanceAgregarBuscarVacio() {
		//en realidad estoy verificando el isMe()
		assertTrue(PresentacionFactory.getInstance(jugador, "") instanceof AgregarBuscarPresentacionFactory);		
	}
	@Test
	public void testGetInstanceAgregarBuscarNulo() {
		assertTrue(PresentacionFactory.getInstance(jugador, null) instanceof AgregarBuscarPresentacionFactory);		
	}
	@Test
	public void testGetInstanceModificarMinuscula() {
		assertTrue(PresentacionFactory.getInstance(jugador, "modificar") instanceof ModificarPresentacionFactory);	
	}
	
	@Test
	public void testGetInstanceModificarMayuscula() {
		assertTrue(PresentacionFactory.getInstance(jugador, "MODIFICAR") instanceof ModificarPresentacionFactory);	
	}
	
	@Test
	public void testGetInstanceModificarMezcla() {
		assertTrue(PresentacionFactory.getInstance(jugador, "Modificar") instanceof ModificarPresentacionFactory);	
	}
	
	@Test
	public void testGetInstanceEliminar() {
		assertTrue(PresentacionFactory.getInstance(jugador, "eliminar") instanceof EliminarPresentacionFactory);
	}
	@Test
	public void testGetInstanceVer() {
		assertTrue(PresentacionFactory.getInstance(jugador, "ver") instanceof VerPresentacionFactory);
	}
	
	@Test
	public void testGetCamposAgregarBuscar() {
		 StringBuffer sb = new StringBuffer("NOMBRRE : <input type ='text' name='nombre'/> <BR>");
		 sb.append("APELLIDO : <input type ='text' name='apellido'/><BR>");
		 sb.append("ALIAS : <input type ='text' name='alias'/><BR>");
		 sb.append("<br>");
		 sb.append("<br>");
		 sb.append("<br>");
		 assertEquals(sb.toString(), PresentacionFactory.getInstance(jugador, null).getCampos());
	}

	@Test
	public void testGetBotonesAbregarBuscar() {		 
		 StringBuffer sb = new StringBuffer("<input type=\"radio\" id=\"Agregar\" name=\"accion\" value=\"Agregar\">");
		 sb.append("<label for=\"Agregar\">Agregar</label><br>");
		 sb.append("<input type=\"radio\" id=\"Buscar\" name=\"accion\" value=\"Buscar\">");
		 sb.append("<label for=\"Buscar\">Buscar</label><br>");
		 sb.append("<input type='submit' value ='accion'>");
		 assertEquals(sb.toString(), PresentacionFactory.getInstance(jugador, null).getBotones());
	}

	

	
}

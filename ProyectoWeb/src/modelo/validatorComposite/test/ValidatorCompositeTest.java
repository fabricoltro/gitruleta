package modelo.validatorComposite.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ar.com.utn.ruleta.modelo.Jugador;
import modelo.validatorComposite.ValidatorComposite;

public class ValidatorCompositeTest {
	Jugador jugador = null;

	@Before
	public void setUp() throws Exception {
		jugador = new Jugador("Gabriel", "Casas", "El Jedi");
	}

	@After
	public void tearDown() throws Exception {
		jugador = null;
	}

	@Test
	public void testGetErroresNombreNulo() {
		jugador.setNombre(null);
		assertEquals("El nombre no puede estar vacío o Nulo\n", ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}

	@Test
	public void testGetErroresNombreVacio() {
		jugador.setNombre("");
		assertEquals("El nombre no puede estar vacío o Nulo\n", ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}

	@Test
	public void testGetErroresApellidoNulo() {
		jugador.setApellido(null);
		assertEquals("El apellido no puede estar vacío o Nulo\n", ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}
	@Test
	public void testGetErroresApellidoVacio() {
		jugador.setApellido("");
		assertEquals("El apellido no puede estar vacío o Nulo\n", ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}

	@Test
	public void testGetErroresAliasNulo() {
		jugador.setAlias(null);
		assertEquals("El alias no puede estar vacío o Nulo\n", ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}
	@Test
	public void testGetErroresAliasVacio() {
		jugador.setAlias("");
		assertEquals("El alias no puede estar vacío o Nulo\n", ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}
	@Test
	public void testGetErroresNombreyApellidoNulos() {
		jugador.setNombre(null);
		jugador.setApellido(null);
		
		assertEquals("El nombre no puede estar vacío o Nulo\nEl apellido no puede estar vacío o Nulo\n", 
				ValidatorComposite.getErrores(jugador,ValidatorComposite.AGREGAR));
	}
	@Test
	public void testSinError(){
	assertTrue(ValidatorComposite.getErrores(jugador, ValidatorComposite.AGREGAR).isEmpty());
}
}

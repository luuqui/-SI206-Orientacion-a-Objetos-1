package unlp.ejercicio15_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
	
	private Carpeta car;
	private Carpeta des;
	private Email em;
	private Archivo ar;

	@BeforeEach
	void setUp() throws Exception {
		car = new Carpeta("carpeta");
		des = new Carpeta("destino");
		em = new Email("Titulo", "cuerpo");
		ar = new Archivo("nombre");
	}

	@Test
	void testMover() {
		car.agregarMail(em);
		car.mover(em, des);
		assertEquals(em, des.encontrar("Titulo"));
	}
	
	@Test
	void testSuma() {
		car.agregarMail(em);
		assertEquals(12, car.sumarTotal());
		assertNotEquals(0, car.sumarTotal());
	}
	
	@Test
	void testEncontrar() {
		car.agregarMail(em);
		assertEquals(em, car.encontrar("Titulo"));
	}

}

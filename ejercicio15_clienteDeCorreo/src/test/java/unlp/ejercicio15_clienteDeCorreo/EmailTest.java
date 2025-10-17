package unlp.ejercicio15_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
	
	private Email e, eVacio;
	private Archivo a;

	@BeforeEach
	void setUp() throws Exception {
		e = new Email("Hola", "Esto es el cuerpo");
		eVacio = new Email("", "");
		a = new Archivo("nombre");
		e.agregarArchivo(a);
	}

	@Test
	void testTamanio() {
		assertEquals(0, eVacio.tamanio());
		assertEquals(27, e.tamanio());
	}
	
	@Test
	void testCumple() {
		assertTrue(e.cumple("Hola"));
		assertFalse(e.cumple("null"));
		assertTrue(eVacio.cumple(""));
		assertFalse(eVacio.cumple("nada"));
	}

}

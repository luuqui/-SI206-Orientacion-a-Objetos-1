package unlp.ejercicio15_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
	
	private Archivo archivo;

	@BeforeEach
	void setUp() throws Exception {
		archivo = new Archivo("Archivito");
	}

	@Test
	void testGetNombre() {
		assertEquals("Archivito", archivo.getNombre());
	}

	@Test
	void testTamanio() {
		assertEquals(9, archivo.tamanio());
	}

}

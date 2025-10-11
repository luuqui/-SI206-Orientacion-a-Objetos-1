package unlp.ejercicio13_inversores;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	private Inversor inversor;
	private Accion accion;
	private PlazoFijo plazoFijo;
	
	@BeforeEach
	void setUp() throws Exception {
		inversor = new Inversor("Luca");
		accion = new Accion("bono", 2, 120);
		plazoFijo = new PlazoFijo(LocalDate.of(2025, 10, 10), 1000.0, 0.415);
	}

	@Test
	void testInversor(){
		assertEquals(0, inversor.getValorActualCartera());
		inversor.agregarInversion(accion);
		inversor.agregarInversion(plazoFijo);
		assertEquals(1655, inversor.getValorActualCartera());
		inversor.sacarInversion(plazoFijo);
		assertEquals(240, inversor.getValorActualCartera());
	}

	@Test
	void Accion() {
		assertEquals(240, accion.getValorActual());
	}

	@Test
	void PlazoFijo() {
		assertEquals(1415, plazoFijo.getValorActual());
	}

}

package unlp.ejercicio11_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	
	private CajaDeAhorro caja;

	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaDeAhorro();
	}

	@Test
	void testDepositar() {
		caja.depositar(1000);
		assertEquals(980, caja.getSaldo());
	}

	@Test
	void testExtraerSinControlar() {
		caja.depositar(1000);
		caja.extraerSinControlar(1000);
		assertEquals(-40, caja.getSaldo());
	}

	@Test
	void testPuedeExtraer() {
		caja.depositar(1000);
		boolean puede = caja.puedeExtraer(500);
		assertTrue(puede);
	}
}

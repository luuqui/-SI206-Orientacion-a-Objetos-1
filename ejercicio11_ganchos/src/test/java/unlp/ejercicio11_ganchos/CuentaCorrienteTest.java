package unlp.ejercicio11_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	
	private CuentaCorriente cuenta;
	private CuentaCorriente cuentaL;

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new CuentaCorriente();
		cuentaL = new CuentaCorriente(50);
	}

	@Test
	void testPuedeExtraer() {
		cuenta.depositar(100);
		cuentaL.depositar(100);
		boolean puede = cuentaL.puedeExtraer(150);
		assertTrue(puede);
	}

	@Test
	void testGetLimite() {
		assertEquals(50, cuentaL.getLimite());
	}

	@Test
	void testSetLimite() {
		cuentaL.setLimite(100);
		assertEquals(100, cuentaL.getLimite());
	}

}

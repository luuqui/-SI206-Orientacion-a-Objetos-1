package unlp.ejercicio15_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	
	private ClienteDeCorreo cli;
	private Carpeta car;
	private Email em, emnull;

	@BeforeEach
	void setUp() throws Exception {
		cli = new ClienteDeCorreo();
		car = new Carpeta("carp");
		em = new Email("tit", "cuerp");
		emnull = new Email("", ""); 
	}

	@Test
	void testBuscar() {
		cli.agregarCarpeta(car);
		car.agregarMail(emnull);
		car.agregarMail(em);
		assertNotNull(cli.buscar("tit"));
	}

	@Test
	void testEspacio() {
		cli.agregarCarpeta(car);
		car.agregarMail(em);
		assertEquals(8, cli.espacioOcupado());
	}
}

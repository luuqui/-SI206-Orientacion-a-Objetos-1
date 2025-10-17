package unlp.ejercicio16_intervalo_de_tiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLapseTest {
	
	private DataLapse d,e,c;
	private DataInstances i;

	@BeforeEach
	void setUp() throws Exception {
		d = new DataLapse(LocalDate.of(2025, 10, 10), LocalDate.of(2025, 10, 17));
		e = new DataLapse(LocalDate.of(2025, 10, 10), LocalDate.of(2025, 10, 10));
		c = new DataLapse(LocalDate.of(2025, 10, 10), LocalDate.of(2025, 10, 5));
		i = new DataInstances(LocalDate.of(2025, 10, 10), 10);
	}

	@Test
	void testSize() {
		assertEquals(7, d.sizeInDays());
		assertEquals(0, e.sizeInDays());
		assertEquals(-5, c.sizeInDays());
		assertEquals(10, i.sizeInDays());
	}
	
	@Test
	void testIncludes() {	
		assertTrue(d.includesDate(LocalDate.of(2025, 10, 13)));
		assertFalse(d.includesDate(LocalDate.of(2025, 10, 9)));
		assertFalse(d.includesDate(LocalDate.of(2025, 10, 18)));
		assertTrue(i.includesDate(LocalDate.of(2025, 10, 13)));
	}

}

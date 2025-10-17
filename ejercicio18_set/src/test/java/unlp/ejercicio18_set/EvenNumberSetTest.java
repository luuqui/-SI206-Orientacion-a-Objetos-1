package unlp.ejercicio18_set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenNumberSetTest {
	
	private Set<Integer> e;

	@BeforeEach
	void setUp() throws Exception {
		e = new EvenNumberSet();
	}

	@Test
	void test() {
		assertTrue(e.add(2));
		assertFalse(e.add(3));
		assertFalse(e.add(2));
	}

}

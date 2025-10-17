package unlp.ejercicio18_set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenNumberSetExtendTest {
	
	private HashSet<Integer> e;

	@BeforeEach
	void setUp() throws Exception {
		e = new EvenNumberSetExtend();
	}

	@Test
	void test() {
		assertTrue(e.add(2));
		assertFalse(e.add(2));
		assertFalse(e.add(3));
	}

}

package n3exercici2;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class PrincipalTest {

	Persona p1 = new Persona("Joan");
	Persona p2 = new Persona("Joan");
	Persona p3 = p2;

	@Test
	public void referenciesIgualsTest() {

		assertSame(p3, p2);

	}

	@Test
	public void referenciesDiferentsTest() {

		assertNotSame(p1, p2);

	}
}

package n3exercici2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PrincipalTest {

	Persona p1 = new Persona(50, "Joan");
	Persona p2 = new Persona(50, "Joan");
	Persona p3 = p2;

	@Test
	public void referenciesIgualsTest() {

		assertThat(Persona.referenciaPersona(p2, p3)).isEqualTo(true);

	}

	@Test
	public void referenciesDiferentsTest() {

		assertThat(Persona.referenciaPersona(p1, p2)).isEqualTo(false);

	}
}

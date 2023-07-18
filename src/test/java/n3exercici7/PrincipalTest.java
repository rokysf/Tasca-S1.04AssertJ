package n3exercici7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PrincipalTest {

	@Test
	public void objecteBuitTest() {
		
		assertThat(Principal.crearObjecteBuit()).isEmpty();
		
	}
}

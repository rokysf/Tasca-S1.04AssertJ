package n3exercici5;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PrincipalTest {

	@Test
	public void conteKeyMapTest() {
		
		assertThat(Principal.crearMap()).containsKey(3);
			
	}
}

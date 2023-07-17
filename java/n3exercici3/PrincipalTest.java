package n3exercici3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PrincipalTest {

	int[] llista1 = {1,2,3,4,5};
	int[] llista2 = {1,2,3,4,5};
				
	@Test
	public void llistesIgualsTest() {
		
		assertThat(Principal.llistesIguals(llista1, llista2)).isTrue();
		
	}
}

package n3exercici3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PrincipalTest {

	int[] llista1 = {1,2,3,4,5};
	int[] llista2 = {1,2,3,4,5};
	int[] llista3 = {1,9,6,4,5};
	
	
	@Test
	public void llistesIgualsTest(int[]llista1, int[]llista2) {
		
		assertThat(Principal.llistesIguals(llista1, llista2)).isEqualTo(true);
		
	}
	
	
}

package n3exercici3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PrincipalTest {
	
	@Test
    public void testIdenticalArrays() {
        
        assertThat(Principal.llista1()).isEqualTo(Principal.llista2());
    }
}

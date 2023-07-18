package n3exercici4;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Test;

public class PrincipalTest {
	
	ArrayList<Object> llista = Principal.crearArray();
	
	@Test
	public void testOrdreLlista() {
		
		assertThat(llista).containsExactly("Hola", 12, 'c');
	}

	@Test
	public void testQualsevolOrdreLlista() {
		
		assertThat(llista).containsExactlyInAnyOrder(12, "Hola", 'c');
	}

	@Test
	public void testUnaVegadaLlista() {
		
		assertThat(llista).containsOnlyOnce("Hola");
	}

	@Test
	public void testNoConteObjecteLlista() {
		
		assertThat(llista).doesNotContain("Cotxe");
	}
}

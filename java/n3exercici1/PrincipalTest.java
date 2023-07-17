package n3exercici1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


public class PrincipalTest {
	
	@Test
	public void igualsTest() {
	
	assertThat(Principal.igualsDiferents(7,7)).isTrue();
	
	}

	@Test
	public void diferentsTest() {
	
	assertThat(Principal.igualsDiferents(7,8)).isFalse();
	
	}

}

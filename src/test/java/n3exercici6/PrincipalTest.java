package n3exercici6;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

public class PrincipalTest {

	int[] array = Principal.arrayEnters();
	int num = 5;
	
	@Test
	public void provocarExcepcioTest() {
				
		assertThatThrownBy(() -> num = array[6]).isInstanceOf(ArrayIndexOutOfBoundsException.class);		
	}
}
	


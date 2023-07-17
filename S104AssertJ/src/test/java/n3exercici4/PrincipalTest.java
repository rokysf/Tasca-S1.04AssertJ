package n3exercici4;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Test;

public class PrincipalTest {
	
	ArrayList<Object> llista = new ArrayList<Object>();

	String obj1 = "Hola";
	int obj2 = 12;
	char obj3 = 'c';
	
	@Test
	public void testOrdreLlista() {

	llista.add(obj1);
	llista.add(obj2);
	llista.add(obj3);
		
	assertThat(Principal.ordreObjectes(llista, obj1, obj2, obj3)).isTrue();
		
	}
}

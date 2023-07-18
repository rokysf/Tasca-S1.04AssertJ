package n3exercici5;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(crearMap());
		
	}

	public static Map<Integer, String> crearMap(){
		Map<Integer, String> llista = new HashMap<Integer, String>();
		llista.put(1,"Joan");
		llista.put(2,"Rosa");
		llista.put(3,"Marta");
		
		return llista;
	}
	
	
}

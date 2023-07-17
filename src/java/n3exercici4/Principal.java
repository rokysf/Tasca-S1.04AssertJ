package n3exercici4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Object> llista = new ArrayList<Object>();

		String obj1 = "Hola";
		int obj2 = 12;
		char obj3 = 'c';

		llista.add(obj1);
		llista.add(obj2);
		llista.add(obj3);
		
		System.out.println(ordreObjectes(llista, obj1, obj2, obj3) ?"Ordre correcte":"Ordre incorrecte");

	}

	public static boolean ordreObjectes(ArrayList<Object> llista, String obj1, int obj2, char obj3) {

		if (llista.get(0).equals(obj1) && llista.get(1).equals(obj2) && llista.get(2).equals(obj3)) {
			return true;
		}else {
			return false;
		}
	}
}

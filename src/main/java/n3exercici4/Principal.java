package n3exercici4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

	System.out.println(crearArray());	
		
		
	}

	public static ArrayList<Object> crearArray(){
		
		ArrayList<Object> llista = new ArrayList<Object>();

		String obj1 = "Hola";
		int obj2 = 12;
		char obj3 = 'c';

		llista.add(obj1);
		llista.add(obj2);
		llista.add(obj3);
		
		return llista;
	}
}

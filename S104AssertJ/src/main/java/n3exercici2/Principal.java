package n3exercici2;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(50, "Joan");
		Persona p2 = new Persona(50, "Joan");
		
		System.out.println(p1);
		System.out.println(p2);
				
		Persona p3 = p2;
		System.out.println(p3);
		
		System.out.println(Persona.referenciaPersona(p2,p3));
		
		

	}

}

package n3exercici1;

public class Principal {

	public static void main(String[] args) {

		Integer num1 = 7;
		Integer num2 = 7;

		System.out.println("Els numeros son "+(igualsDiferents(num1, num2)?"iguals":"diferents"));
	
	}

	public static boolean igualsDiferents(Integer num1, Integer num2) {
		boolean resultat = false;
		if (num1 == num2) {
			resultat = true;
		}

		return resultat;
	}

}

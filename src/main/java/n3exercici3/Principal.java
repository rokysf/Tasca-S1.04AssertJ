package n3exercici3;

public class Principal {

	public static void main(String[] args) {

		int[] llista1 = { 1, 2, 3, 4, 5 };
		int[] llista2 = { 1, 2, 3, 4, 8 };
		int[] llista3 = { 1, 2, 3, 4, 5 };

		System.out.println(llistesIguals(llista1, llista2) ? "Les llistes son iguals" : "Les llistes son diferents");

	}

	public static boolean llistesIguals(int[] llista1, int[] llista2) {
		boolean resultat = true;
		int i = 0;
		while (resultat == true && llista1[i] != llista1.length) {
			if (llista1[i] == llista2[i]) {
				i++;
			} else {
				resultat = false;
			}
		}

		return resultat;

	}

}

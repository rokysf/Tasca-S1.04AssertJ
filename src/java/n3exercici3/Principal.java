package n3exercici3;

public class Principal {

	public static void main(String[] args) {

		int[] llista1 = { 1, 2, 3, 4, 5 };
		int[] llista2 = { 1, 2, 3, 4, 5 };

		System.out.println(llistesIguals(llista1, llista2) ? "Les llistes son iguals" : "Les llistes son diferents");

	}

	public static boolean llistesIguals(int[] llista1, int[] llista2) {

		int i = 0;
		while (i < llista1.length && llista1[i] == llista2[i]) {
			i++;
		}
		if (i == llista1.length) {
			return true;
		} else {
			return false;
		}
	}
}
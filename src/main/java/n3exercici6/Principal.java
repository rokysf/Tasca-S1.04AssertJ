package n3exercici6;

public class Principal {

	public static void main(String[] args) {
	
		int[] array = arrayEnters();
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static int[] arrayEnters() {
		
		int[] array = {1,2,3};
		return array;
	}
}

package n3exercici2;

public class Persona {

	private int edat;
	private String nom;

	public Persona(int edat, String nom) {
		this.edat = edat;
		this.nom = nom;
	}

	public static boolean referenciaPersona(Persona p1, Persona p2) {
		boolean resultat = false;

		if (p1.equals(p2)) {
			resultat = true;
		}

		return resultat;
	}

}

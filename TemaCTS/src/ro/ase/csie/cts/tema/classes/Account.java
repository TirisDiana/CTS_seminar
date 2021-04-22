package ro.ase.csie.cts.tema.classes;

public enum Account {
	STANDARD(0),
	BUGET(1),
	PREMIUM(2),
	SUPER_PREMIUM(3);
	
	private final int valoare;
	
	Account(int valoare) {
		this.valoare=valoare;
	}
	
	public int getValoare() {
		return valoare;
	}
}

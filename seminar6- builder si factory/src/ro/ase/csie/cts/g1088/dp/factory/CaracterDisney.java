package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterDisney extends CaracterAbstract{

	String culoare;
	boolean okPentruCopiiMici;
	
	

	public CaracterDisney(String culoare, String nume, boolean ok) {
		this.nume=nume;
		this.culoare = culoare;
	}

	@Override
	public void alearga() {
		System.out.println("alearga......");
		
	}

	@Override
	public void sare() {
		System.out.println("sare......");
		
	}
}

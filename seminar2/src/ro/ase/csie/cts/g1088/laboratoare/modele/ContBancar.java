package ro.ase.csie.cts.g1088.laboratoare.modele;

public abstract class ContBancar extends Cont {

	protected double balanta;
	protected String iban;
	
	
	//sa ne oblige sa avem balanta si iban in celelalte cls care o mostenesc
	public ContBancar(double balanta, String iban) {
		this.balanta = balanta;
		this.iban = iban;
	}

	//supradefinire metode=> sa nu modificam ceva in headerul metodei

	@Override //verifica daca e o metoda mostenita
	public double getBalanta() {
		return this.balanta;
	}
	
	
	
}

package ro.ase.csie.cts.g1088.dp.decorater;

public abstract class SuperErou {
	String nume;
	int puncteViata;
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	//metode care def comportamaneutl standard al unui supererou
	public abstract void alearga();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
}

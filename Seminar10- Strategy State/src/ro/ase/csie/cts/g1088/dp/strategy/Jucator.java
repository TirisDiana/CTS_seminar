package ro.ase.csie.cts.g1088.dp.strategy;

public class Jucator {

	int totalOreJucate;
	String nume;
	int clasaJucator;
	
	InterfataStrategieMarketing strategiemk=null;
	
	
	public Jucator(int totalOreJucate, String nume, int clasaJucator) {
		super();
		this.totalOreJucate = totalOreJucate;
		this.nume = nume;
		this.clasaJucator = clasaJucator;
	}


	public int getTotalOreJucate() {
		return totalOreJucate;
	}


	public String getNume() {
		return nume;
	}



	public int getClasaJucator() {
		return clasaJucator;
	}


//METODA OBLIGATORIE PT STRATEGY
	public void setStrategiemk(InterfataStrategieMarketing strategiemk) {
		this.strategiemk = strategiemk;
	}



	public void acordaPuncteBonus() {
		if(this.strategiemk != null) {
			this.strategiemk.aplicaStrategieBonus(this);
		} 
		else 
			throw new UnsupportedOperationException();
		
	}
}

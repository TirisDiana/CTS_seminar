package ro.ase.csie.cts.tema.classes;

public class Cont implements Rata {
	private double valoareImprumut;
	private final double rata;
	private final int zileActivitate;
	private final int tipCont;
	
	public Cont(double valoareImprumut, double rata, int zileActivitate, int tipCont) throws Exception{
		if(valoareImprumut <0) {
			throw new Exception("Valoarea imprumutului nu poate fi mai mica de 0");
		} else {
			this.valoareImprumut=valoareImprumut;
		}
		this.rata = rata;
		this.zileActivitate = zileActivitate;
		this.tipCont = tipCont;
	}

	public double getValoareImprumut() {
		return valoareImprumut;
	}
	
	public double getRata() {
		return this.rata;
	}
	
	public int getZileActivitate() {
		return zileActivitate;
	}
	
	public int getTipCont() {
		return this.tipCont;
	}
	
	public void setValoareImprumut(double valoareImprumut) throws Exception {
		if(valoareImprumut < 0) {
			throw new Exception();
		} else {
			this.valoareImprumut=valoareImprumut;
		}
	}
	
	/**
	 * metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	 * 
	 * @return valoareImprumut * rata
	 */
	
	@Override
	public double getRataLunara() {
		return valoareImprumut * rata;
	}
	
	public String toString() {
		return "Loan: " + this.valoareImprumut + "; rate: " + this.rata + "; days active:" + zileActivitate + "; Type: " + tipCont + ";";
	}
	
	public void print() {
		System.out.println("This is an account");
	}
}

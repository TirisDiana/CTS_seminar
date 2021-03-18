package ro.ase.csie.cts.g1088.laborator3.faza1;

public enum TipProdus {
NOU(0), DISCOUNT(0.1f),STOC_LIMITAT(0.25f),VECHI(0.35f);

private final float discount; //am obtinut obiect imutable, String este si ea o cls imutable

private TipProdus(float discount) {
	this.discount=discount;
}

private TipProdus() {
	this.discount=0;
}

public float getDiscount() {
	return this.discount;
}

}

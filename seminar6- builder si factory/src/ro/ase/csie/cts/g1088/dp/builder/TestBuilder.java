package ro.ase.csie.cts.g1088.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1.creare
		//SuperErou superErou=new SuperErou();
		//2.initializare
		//...
		//superErou.nume="Superman";
		
	//	SuperErou superErou2= new SuperErou("Superman",100, false,false,new Arma(), null,null,null);
		
		SuperErou superman=new SuperErou.SuperErouBuilder("Superman", 100).build();
		SuperErou joker=new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();

	}

}

package ro.ase.csie.cts.g1088.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		//ConexiuneDB conexiune1= new ConexiuneDB("10.0.0.1","cts");
		//ConexiuneDB conexiune2= new ConexiuneDB("10.0.0.1","cts");
		
		ConexiuneDB conexiune1= ConexiuneDB.getConexiune();
		ConexiuneDB conexiune2= ConexiuneDB.getConexiune();
		
		if(conexiune1==conexiune2) {
			System.out.println("cele 2 referinte sunt egale");
		}else{
			System.out.println("cele 2 referinte sunt diferite");
		}
		
		ModulUI modulUI=new ModulUI();
		ModulProfil modulProfil=new ModulProfil();

	}

}

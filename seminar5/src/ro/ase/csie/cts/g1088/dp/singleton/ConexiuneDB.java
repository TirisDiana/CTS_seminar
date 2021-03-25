package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneDB {
    String ip;
    String denumire;
    
    //versiunea eager
   // private static ConexiuneDB conexiune=new ConexiuneDB("10.0.0.1","cts");
    
    private static ConexiuneDB conexiune=null;
    
    private ConexiuneDB() {
    	
    }
    
 private ConexiuneDB(String ip, String denumire) {
	 System.out.println("Apel constructor");
    	this.ip=ip;
    	this.denumire=denumire;
    }
    
 //versiune lazy
 public static ConexiuneDB getConexiune() {
	 if(conexiune==null) {
		 //datele preluate din fis de configurare
		 conexiune=new ConexiuneDB("10.0.0.1","cts");
	 }
	 return conexiune;
 }
 
}

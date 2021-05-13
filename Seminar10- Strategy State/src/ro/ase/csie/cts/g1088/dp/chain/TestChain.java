package ro.ase.csie.cts.g1088.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		//nodurile din chain
		ModulProcesareMesaj modulFiltru= new ModulFiltruRomana();
		ModulProcesareMesaj modulPrivat= new ModulMesajePrivate();
		ModulProcesareMesaj modulGrup=new ModulMesajeGrup();
		
		//trb sa le legam unele de altele
		modulFiltru.setNext(modulPrivat);
		modulPrivat.setNext(modulGrup);
		
		//un alt mod. asta e capatul filtrului
		ModulProcesareMesaj serverChat=modulFiltru;
		
		serverChat.procesareMesaj(new MesajChat("Salut", 2, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("Esti un jucator rau", 3, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("Salut", 0 , "@everyone"));
		
	}

}

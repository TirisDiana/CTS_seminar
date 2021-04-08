package ro.ase.csie.cts.g1088.dp.factory.method;

public class TestFactory {

	public static void main(String[] args) {
		
		boolean isModJoc4Kids;
		
		if(isModJoc4Kids=true) {
			//dezvoltare doar cu caractere 4kids
		}else {
			//dezvoltare doar cu caractere normale
		}
		
		FactoryAbstractCaracter factoryCaracter=null;
		factoryCaracter=(isModJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();
		
		//dezvoltare joc
		CaracterJoc superman= factoryCaracter.getCaracter(TipCaracter.MARVEL, "Superman");

	}

}

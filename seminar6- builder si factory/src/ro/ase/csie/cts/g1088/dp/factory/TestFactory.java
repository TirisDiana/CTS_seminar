package ro.ase.csie.cts.g1088.dp.factory;

import java.util.ArrayList;

public class TestFactory {

	public static void main(String[] args) {

		//CaracterAbstract mickeyMouse=new CaracterDisney("rosu", "Mickey Mouse");
		
		//CaracterAbstract spiderMan=new CaracterMarvel(100, "Spiderman");
		
		//ArrayList<CaracterAbstract> caractere=new ArrayList();
		
		CaracterAbstract mickeymouse=FactoryCaractere.getCaracter(TipCaracter.DISNEY, "Mickey");

		ArrayList<CaracterAbstract> caractere=new ArrayList();
	}

}

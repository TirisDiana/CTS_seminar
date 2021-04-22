package ro.ase.csie.cts.g1088.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMode3D implements InterfataFlyweightModel3D {
	
	public String numeModel;
	List<Integer> puncteModel=new ArrayList<>(); //stare permanenta
	
	
	
	public FlyweightMode3D(String numeModel) {
		super();
		this.numeModel = numeModel;
	}


	@Override
	public void afisareEcran(DateEcran date) {
		System.out.println(String.format("Afisare %s la coordonatele %d,%d,%d cu %s",
				numeModel, date.x, date.y, date.z, date.textura));
		
	}

}

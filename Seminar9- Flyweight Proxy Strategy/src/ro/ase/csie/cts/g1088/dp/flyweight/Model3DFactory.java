package ro.ase.csie.cts.g1088.dp.flyweight;
import java.util.HashMap;
import java.util.Map;

//asta e Flyweight Factory
public class Model3DFactory {
	
	public static Map<String, InterfataFlyweightModel3D> modele =new HashMap<>();
	
	//eager
	
	static {
		modele.put(TipModel3D.CLADIRE.toString(), new FlyweightMode3D("Cladie"));
		modele.put(TipModel3D.SOLDAT.toString(), new FlyweightMode3D("Soldat"));
	}
	
	public static InterfataFlyweightModel3D getModel(TipModel3D tip) {
		return modele.get(tip.toString());
		
	}
}

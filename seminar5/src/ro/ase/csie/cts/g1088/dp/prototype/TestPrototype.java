package ro.ase.csie.cts.g1088.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		Caracter3D caracter1 = new Caracter3D("model1.3d");
		//Caracter3D caracter2 = new Caracter3D("model1.3d");
		Caracter3D caracter3 = new Caracter3D("model1.3d");

		Caracter3D caracter2 = (Caracter3D) caracter1.clone();
	}

}

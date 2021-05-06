package ro.ase.csie.cts.g1088.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		Jucator jucator= new Jucator(150, "Ionel", 7);
		jucator.setStrategiemk(new StrategieJucatorNou());
		
		jucator.acordaPuncteBonus();
		
		jucator.setStrategiemk(new StrategieZiuaCopilului());
		
		jucator.acordaPuncteBonus();

	}

}

package ro.ase.csie.cts.tema.classes;

public class Comision {

	public static double calculeazaComision(Cont [] conturi) {
		double comisionTotal= 0.0;
		int temp=365;
		Cont cont;
		for (Cont value : conturi) {
			cont = value;
			if(cont.getTipCont() == Account.PREMIUM.getValoare() || cont.getTipCont() == Account.SUPER_PREMIUM.getValoare())
				comisionTotal += .0125 * (cont.getValoareImprumut() * Math.pow(cont.getRata(), (cont.getZileActivitate() / temp)) - cont.getValoareImprumut());
		}
		return comisionTotal;
	}
}

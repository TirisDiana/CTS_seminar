package ro.ase.csie.cts.tema.main;

import ro.ase.csie.cts.tema.classes.Account;
import ro.ase.csie.cts.tema.classes.Comision;
import ro.ase.csie.cts.tema.classes.Cont;

public class Main {

	public static void main(String[] args) throws Exception {
		Cont cont=new Cont(2300.90, 0.064,365, Account.BUGET.getValoare());
		Cont cont2=new Cont(2400.90, 0.084,365, Account.PREMIUM.getValoare());
		Cont cont3=new Cont(2500.90, 0.094,365, Account.SUPER_PREMIUM.getValoare());
		cont.print();
		
		 System.out.println("Valoarea imprumutului este de " + cont.getValoareImprumut());
	     System.out.println("Tipul contului este " + cont.getTipCont());
	     System.out.println("Rata este in valoare de " + cont.getRata());
	     System.out.println("Rata lunara este de " + cont.getRataLunara());
	     System.out.println("Numarul de zile de activitate este de " + cont.getZileActivitate());
	     
	     cont.setValoareImprumut(2500.87);
	     System.out.println(cont.getValoareImprumut());
	     
	     Cont[] conturi = {cont, cont2, cont3};
	     System.out.println(Comision.calculeazaComision(conturi));
	}
}

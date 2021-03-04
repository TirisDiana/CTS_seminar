package ro.ase.csie.cts.g1088.laboratoare.modele;

import ro.ase.csie.cts.g1088.laboratoare.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1088.laboratoare.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
public abstract double getBalanta();
//Object- primesc valoare generica
public abstract void alimenteaza(Double valoare);
public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
public abstract void transfer(Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;

}
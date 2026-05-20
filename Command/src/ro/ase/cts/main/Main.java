package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.Plecare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("BMW WW","X");

        Plecare plecare1=new Plecare(autobuz1,120);
        Plecare plecare2=new Plecare(autobuz1,130);


        Operator operator=new Operator();

        operator.adaugaComanda(plecare1);
        operator.adaugaComanda(plecare2);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
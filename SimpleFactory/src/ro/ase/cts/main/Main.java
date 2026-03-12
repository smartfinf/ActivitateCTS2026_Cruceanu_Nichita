package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.factory.Depou;
import ro.ase.cts.factory.Tipuri;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Depou depou =new Depou();
        MijlocTransport autobuz=depou.getMijlocTransporta(Tipuri.Autobuz,7,"BHNG234");
        MijlocTransport troleu=depou.getMijlocTransporta(Tipuri.Troleibuz,2,"BMNG238");

        autobuz.afiseazaDescriere();
        troleu.afiseazaDescriere();
    }
}
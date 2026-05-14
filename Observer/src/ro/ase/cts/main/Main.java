package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorAbonat;
import ro.ase.cts.clase.MijlocDeTransport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calator calator=new CalatorAbonat("Nick");
        Calator calator2=new CalatorAbonat("Bogdan");
        Calator calator3=new CalatorAbonat("Raza");
        Calator calator4=new CalatorAbonat("Marcel");

        MijlocDeTransport autobuz=new Autobuz("10");

        autobuz.abonareCalator(calator);
        autobuz.abonareCalator(calator2);
        autobuz.abonareCalator(calator3);
        autobuz.pleacaDinDepou();
        autobuz.abonareCalator(calator4);
        autobuz.dezabonareCalator(calator3);
        autobuz.ramaneBlocatInTrafic();
    }
}
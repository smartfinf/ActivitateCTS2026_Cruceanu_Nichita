package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Linie;
import ro.ase.cts.clase.ManagerLinie;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("bmw",1960,20);
        Autobuz autobuz2=new Autobuz("bmw",1963,25);

        Linie linie=new Linie(170,"Ionescu","Vrancea");

        ManagerLinie managerLinie=new ManagerLinie();

        managerLinie.getLinii(170,"Vrancea","Ionel").descriereLiinie(autobuz2);
        managerLinie.getLinii(180,"Vrancea","Ionel").numarMaximPasageriPeLinie(autobuz1);


    }
}
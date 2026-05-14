package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieDeTransport;
import ro.ase.cts.clase.ManagerLinie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Nou", 2000, 30);
        Autobuz autobuz2 = new Autobuz("Nou", 2010, 40);
        Autobuz autobuz3 = new Autobuz("Vechi", 1980, 25);

        ManagerLinie managerLinii = new ManagerLinie();


        managerLinii.getLinie(101, "Romana", "Universitate").numarMaximPasageriPeLinie(autobuz3);
        managerLinii.getLinie(101, "fhsfhf", "shasa").descriereLiinie(autobuz2);
    }
}
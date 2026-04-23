package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Roni", 5);
        Pacient pacient1 = new Pacient("Lebron", 2);
        Pacient pacient2 = new Pacient("James", 6);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if(medic.areTrimitere(pacient)){
            int patLiber = salon.getPatLiber();
            if(patLiber > -1){
                System.out.println("Pacientul " +  pacient.getNume() + "este internat in patul " + salon.getPatLiber());
                salon.ocupaPat(patLiber);
            } else {
                System.out.println("Nu avem paturi libere");
            }
        } else{
            System.out.println("Ai nevoie de trimitere");
        }

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);

        receptieSpital.interneazaSpital(pacient1);
        receptieSpital.interneazaSpital(pacient2);

    }
}
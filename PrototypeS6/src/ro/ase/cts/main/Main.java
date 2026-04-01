package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareAbstracta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rezervare rez1=new Rezervare("Gica",20,10,"0893456789");
        Rezervare rez2=(Rezervare) rez1.clone();

        rez2.setOraRezervare(10);
        rez2.setZiuaRezervarii(10);
        //Se poate face respectand dependency inversion(jos)
//        RezervareAbstracta rez1=new Rezervare("Gica",20,10,"0893456789");
//        RezervareAbstracta rez2=(Rezervare) rez1.clone();
//
//        ((Rezervare)rez2).setOraRezervare(10);
//        ((Rezervare)rez2).setZiuaRezervarii(10);
        System.out.println(rez1.toString());
        System.out.println(rez2.toString());

    }
}
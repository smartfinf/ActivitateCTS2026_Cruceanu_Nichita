package ro.ase.cts.main;

import ro.ase.cts.clase.AMasina;
import ro.ase.cts.clase.Masina;
import ro.ase.cts.clase.Service;
import ro.ase.cts.enums.TipMasina;
import ro.ase.cts.factories.FabricaMasini;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Service service=Service.getService(123);
        Masina masina1=new Masina("AB");
        Masina masina2=new Masina("AC");
        Masina masina3=new Masina("AF");
        Masina masina4=new Masina("AD");
//        System.out.println(masina);
        service.repara(masina1);
        service.repara(masina2);
        service.repara(masina3);
        service.repara(masina4);

        FabricaMasini fabricaMasini=new FabricaMasini();
        AMasina masina5=fabricaMasini.getMasina(TipMasina.SEDAN);
        AMasina masina6=fabricaMasini.getMasina(TipMasina.VAN);
        AMasina masina7=fabricaMasini.getMasina(TipMasina.SUV);
        AMasina masina8=fabricaMasini.getMasina(TipMasina.SEDAN);

        System.out.println(masina5.toString());
        System.out.println(masina6.toString());

    }
}
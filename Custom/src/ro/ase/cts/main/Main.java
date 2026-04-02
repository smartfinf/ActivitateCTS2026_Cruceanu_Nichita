package ro.ase.cts.main;

import ro.ase.cts.clase.Masina;
import ro.ase.cts.clase.Service;

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

    }
}
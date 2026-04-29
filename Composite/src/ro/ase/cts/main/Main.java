package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura depMarketing=new Departament("Marketing");
        Structura depAdmin=new Departament("Admin");
        Structura sectieSecretariat=new Sectie("Secretariat",1);
        Structura sectieManagement=new Sectie("Management",2);

        ((Departament)depMarketing).adugaStructura(sectieManagement);
        ((Departament)depMarketing).adugaStructura(sectieSecretariat);
        ((Departament)depAdmin).adugaStructura(sectieManagement);

        depMarketing.afiseazaDetaliiStructura(" ");

        ((Departament)depMarketing).stergeStructura(sectieManagement);
        ((Departament)depAdmin).adugaStructura(sectieSecretariat);

        depAdmin.afiseazaDetaliiStructura(" ");
    }
}
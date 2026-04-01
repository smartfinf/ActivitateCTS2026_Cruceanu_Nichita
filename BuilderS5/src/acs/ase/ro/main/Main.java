package acs.ase.ro.main;

import acs.ase.ro.builder01.AbstractBuilder;
import acs.ase.ro.builder01.Internare;
import acs.ase.ro.builder01.InternareBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Internare internare=new Internare("Matei",false,false,false,false);
        System.out.println(internare.toString());

        InternareBuilder builder=new InternareBuilder("BoB");
        Internare internare1= new Internare("matei",false,false,false,false);
        Internare internare2 = builder.setPatRabatabil(true).setNumePacient("TBuilder").build();
        Internare internare3=new InternareBuilder("More").build();
    }
}
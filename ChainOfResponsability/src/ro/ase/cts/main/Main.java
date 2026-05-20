package ro.ase.cts.main;

import ro.ase.cts.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("DA");
        CalatorieHandler calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz.setSuccesor(calatorieTramvai.setSuccesor(calatorieMetrou)));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(9));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(11));



    }
}
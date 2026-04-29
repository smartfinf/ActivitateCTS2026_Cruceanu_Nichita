package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataPrintatNouAn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata=new NotaDePlata(10f,"20.04.2009");
        System.out.println(notaDePlata);

        NotaDePlataDecorator notaDePlataDecorator=new NotaDePlataPrintatNouAn(notaDePlata);
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
        int a=2;
        NotaDePlataDecorator notaDePlataDecorator1;
        if(a==1){
            notaDePlataDecorator1=new NotaDePlataPrintatNouAn(notaDePlata) ;
        }
        else {
            notaDePlataDecorator1 = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlataDecorator1.printeaza();

        notaDePlataDecorator1.printeazaFelicitare();
    }
}
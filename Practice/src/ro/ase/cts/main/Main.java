package ro.ase.cts.main;

import ro.ase.cts.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Utilaj utilajTaiere = new Utilaj("Taiere-CNC");
        Utilaj utilajSlefuire = new Utilaj("Slefuire");

        Departament financiar = new DepartamentFinanciar();
        Departament depositare = new DepartamentDepositare();
        Departament transport = new DepartamentTransport();

        utilajTaiere.adaugaDepartament(financiar);
        utilajTaiere.adaugaDepartament(depositare);
        utilajTaiere.adaugaDepartament(transport);

        utilajSlefuire.adaugaDepartament(financiar);
        utilajSlefuire.adaugaDepartament(depositare);

        PlacaLemn placa1 = new PlacaLemn("Stej", 4, 2, 15);
        PlacaLemn placa2 = new PlacaLemn("Fag", 3, 1, 12);
        PlacaLemn placa3 = new PlacaLemn("Pin", 5, 2, 9);


        utilajTaiere.proceseazaPlaca(placa1);
        utilajSlefuire.proceseazaPlaca(placa2);
        Hala halaFabrica = new Hala(22.0, 18.0, 4500.0
                , 5000.0);

        ProxyUtilaj proxyTaiere = new ProxyUtilaj(utilajTaiere, halaFabrica);
        proxyTaiere.proceseazaDoarTemperatura(placa1);
        halaFabrica.setConsumCurent(5500.0);
        proxyTaiere.proceseazaDoarConsum(placa2);
        halaFabrica.setConsumCurent(4000.0);
        halaFabrica.setTemperaturaInterna(25.0);
        proxyTaiere.proceseazaPlaca(placa3);
    }
}
package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Utilaj implements IUtilaj {
    private String numeUtilaj;
    private List<Departament> departamente;

    public Utilaj(String numeUtilaj) {
        this.numeUtilaj = numeUtilaj;
        this.departamente = new ArrayList<>();
    }

    public void adaugaDepartament(Departament departament) {
        departamente.add(departament);
    }

    public void stergeDepartament(Departament departament) {
        departamente.remove(departament);
    }

    @Override
    public void proceseazaPlaca(PlacaLemn placa) {
        System.out.println("Utilajul [" + numeUtilaj + "] a procesat placa de " + placa.getTipLemn());
        for (Departament d : departamente) {
            d.notificareProcesare(placa);
        }
    }
}
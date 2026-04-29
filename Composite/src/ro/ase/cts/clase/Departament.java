package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDep;
    private List<Structura> listaStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.listaStructuri = new ArrayList<>();
    }


    @Override
    public void afiseazaDetaliiStructura(String Spatii) {
        System.out.println("Nume Dep:" + numeDep + "\n" + listaStructuri);
    }

    public void adugaStructura(Structura structura) {
        listaStructuri.add(structura);
    }

    public void stergeStructura(Structura structura) {
        listaStructuri.remove(structura);
    }

    public Structura getStructura(int pozitie) {
        return listaStructuri.get(pozitie);
    }

}


package ro.ase.cts.clase;

public abstract class AMasina {
    String numarInmatriculare;

    public AMasina(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }
    public abstract void afiseazaDetalii();

}

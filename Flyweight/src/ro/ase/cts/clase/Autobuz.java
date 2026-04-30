package ro.ase.cts.clase;

public class Autobuz {
    private String model;
    private int an;
    private int nrLocuri;

    public int getNrLocuri() {
        return nrLocuri;
    }

    public Autobuz(String model, int an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }


}

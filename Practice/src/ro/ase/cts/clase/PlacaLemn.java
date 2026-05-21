package ro.ase.cts.clase;

public class PlacaLemn {
    private String tipLemn;
    private int suprafata;
    private int grosime;
    private int costPerMp;

    public PlacaLemn(String tipLemn, int suprafata, int grosimea, int costPerMp) {
        this.tipLemn = tipLemn;
        this.suprafata = suprafata;
        this.grosime = grosimea;
        this.costPerMp = costPerMp;
    }

    public String getTipLemn() {
        return tipLemn;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int getGrosime() {
        return grosime;
    }

    public int getCostPerMp() {
        return costPerMp;
    }
}

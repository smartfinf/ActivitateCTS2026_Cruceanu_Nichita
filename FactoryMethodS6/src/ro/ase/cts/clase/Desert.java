package ro.ase.cts.clase;

public abstract class Desert implements FelMancare{
    int pret;
    int calorii;
    int gramaj;

    public Desert(int pret, int calorii, int gramaj) {
        this.pret = pret;
        this.calorii = calorii;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}

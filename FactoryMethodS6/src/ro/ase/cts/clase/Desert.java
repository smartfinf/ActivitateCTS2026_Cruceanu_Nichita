package ro.ase.cts.clase;

public abstract class Desert implements FelMancare{
    float pret;
    float calorii;
    float gramaj;

    public Desert(float pret, float calorii, float gramaj) {
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

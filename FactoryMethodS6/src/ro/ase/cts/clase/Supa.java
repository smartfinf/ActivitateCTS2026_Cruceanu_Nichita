package ro.ase.cts.clase;

public abstract class Supa implements FelMancare {
    public int pret;
    public int gramaj;

    public Supa(int pret, int gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}

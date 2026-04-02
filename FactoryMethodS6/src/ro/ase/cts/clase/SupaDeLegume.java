package ro.ase.cts.clase;

public class SupaDeLegume extends Supa {
    public SupaDeLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de legume are:").append(super.toString());
        return super.toString();
    }

    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');

        System.out.println(sb);
    }
}

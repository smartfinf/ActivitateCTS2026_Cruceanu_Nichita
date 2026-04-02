package ro.ase.cts.clase;

public class SupaDeCiuperci extends Supa {
    public SupaDeCiuperci(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de ciuperci are:").append(super.toString());
        return super.toString();
    }

    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');

        System.out.println(sb);
    }
}

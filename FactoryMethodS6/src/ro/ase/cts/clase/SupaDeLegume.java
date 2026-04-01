package ro.ase.cts.clase;

public class SupaDeLegume extends Supa {
    public SupaDeLegume(int pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de legume are:").append(super.toString());
        return super.toString();
    }
}

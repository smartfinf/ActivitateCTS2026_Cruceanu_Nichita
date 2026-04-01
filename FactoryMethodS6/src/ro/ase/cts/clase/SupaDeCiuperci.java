package ro.ase.cts.clase;

public class SupaDeCiuperci extends Supa {
    public SupaDeCiuperci(int pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de ciuperci are:").append(super.toString());
        return super.toString();
    }
}

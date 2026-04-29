package ro.ase.cts.clase;

public class Sectie implements Structura {
    private String numeDep;
    private int nrAngajati;

    public Sectie(String numeDep, int nrAngajati) {
        this.numeDep = numeDep;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("numeDep='").append(numeDep).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        System.out.println(sb);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("numeDep='").append(numeDep).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}

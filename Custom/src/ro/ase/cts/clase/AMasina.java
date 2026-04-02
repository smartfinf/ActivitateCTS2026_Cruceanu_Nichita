package ro.ase.cts.clase;

import ro.ase.cts.enums.TipMasina;

public abstract class AMasina {
    protected String numarInmatriculare;

    protected AMasina(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }
    public abstract void afiseazaDetalii();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

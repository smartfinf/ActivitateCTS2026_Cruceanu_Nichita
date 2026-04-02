package ro.ase.cts.clase;

import ro.ase.cts.enums.TipMasina;

public class Masina extends AMasina{
    public Masina(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.numarInmatriculare);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

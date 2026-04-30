package cts.ase.ro.clase;

public class Autobuz implements MijlocDeTransport{
    private int nrCalatori;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
        this.tipCursa= TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int nrCalatori, int nrLinie, TipCursa tipCursa) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    @Override
    public MijlocDeTransport getMijlocDeTransport() {
        return this;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linie"+nrLinie+" opreste la statia"+statie.getNume());
    }

    @Override
    public int getNrPasageri() {
        return nrCalatori;
    }

    @Override
    public TipCursa getTipCursa() {
        return tipCursa;
    }
}

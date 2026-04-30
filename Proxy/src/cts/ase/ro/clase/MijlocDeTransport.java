package cts.ase.ro.clase;

public interface MijlocDeTransport {
    MijlocDeTransport getMijlocDeTransport();

    void opresteInStatie(Statie statie);
    int getNrPasageri();
    TipCursa getTipCursa();

}

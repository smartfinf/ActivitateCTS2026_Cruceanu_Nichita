package cts.ase.ro.clase;

public class AutobuzNoapte implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public MijlocDeTransport getMijlocDeTransport() {
        return this.mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(statie.getNrCalatori()>0||this.mijlocDeTransport!=null)
            this.mijlocDeTransport.opresteInStatie(statie);
        else
            System.out.println("Autobuzul de pe linie"+statie+"opreste la statia"+statie.getNume());

    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return mijlocDeTransport.getTipCursa();
    }
}

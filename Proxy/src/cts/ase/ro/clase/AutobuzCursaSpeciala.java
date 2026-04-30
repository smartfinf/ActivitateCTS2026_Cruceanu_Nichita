package cts.ase.ro.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{

    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public MijlocDeTransport getMijlocDeTransport() {
        return null;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getTipCursa()==TipCursa.CURSA_SPECIALA){
            System.out.println("Auto e in cursa speciala, nu opreste in statie");

        }
        else {
            this.mijlocDeTransport.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrPasageri() {
        return mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}

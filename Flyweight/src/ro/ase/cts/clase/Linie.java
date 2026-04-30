package ro.ase.cts.clase;

public class Linie implements LinieDeTransport{
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(String primaStatie, String ultimaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLiinie(Autobuz autobuz) {
        System.out.println("Linia"+this.primaStatie+"Ultima statie: "+this.ultimaStatie+"Nr linie"+nrLinie+"Autobuz: "+autobuz.toString());
    }

    @Override
    public void numarMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Nr maxim de calatori intre statiile"+this.primaStatie+"- "+this.ultimaStatie+"este"+autobuz.getNrLocuri());
    }
}

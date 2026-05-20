package ro.ase.cts.clase;

public class Linie implements LinieDeTransport{
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public void setPrimaStatie(String primaStatie) {
        this.primaStatie = primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    public void setUltimaStatie(String ultimaStatie) {
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLiinie(Autobuz autobuz) {
        System.out.println("Linia "+this.primaStatie+" Ultima statie: "+this.ultimaStatie+" Nr linie: "+this.nrLinie+" Autobuz: "+autobuz.toString());
    }

    @Override
    public void numarMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Nr maxim de calatori intre statiile "+this.primaStatie+"- "+this.ultimaStatie+" este "+autobuz.getNrLocuri());
    }
}

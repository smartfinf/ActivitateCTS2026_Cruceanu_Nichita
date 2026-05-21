package ro.ase.cts.clase;

public class Hala {
    private double temperaturaInterna;
    private double temperaturaExterna;
    private double consumCurent;
    private double consumMaximEnergie;

    public Hala(double temperaturaInterna, double temperaturaExterna, double consumCurent, double consumMaximEnergie) {
        this.temperaturaInterna = temperaturaInterna;
        this.temperaturaExterna = temperaturaExterna;
        this.consumCurent = consumCurent;
        this.consumMaximEnergie = consumMaximEnergie;
    }

    public double getTemperaturaInterna() { return temperaturaInterna; }
    public void setTemperaturaInterna(double temperaturaInterna) { this.temperaturaInterna = temperaturaInterna; }
    public double getConsumCurent() { return consumCurent; }
    public void setConsumCurent(double consumCurent) { this.consumCurent = consumCurent; }
    public double getConsumMaximEnergie() { return consumMaximEnergie; }
}
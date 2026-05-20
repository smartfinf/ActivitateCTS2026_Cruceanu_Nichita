package ro.ase.cts.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public CalatorieHandler setSuccesor(CalatorieHandler succesor) {
        this.succesor = succesor;
        return this;
    }

    public abstract String recomandaCalatorie(double distanta);


}

package ro.ase.cts.clase;

public class DepartamentTransport implements Departament {
    @Override
    public void notificareProcesare(PlacaLemn placa) {
        System.out.println("Transport: Pregatire logistica transport placa " + placa.getTipLemn() + " (" + placa.getGrosime() + " cm grosime).");
    }
}
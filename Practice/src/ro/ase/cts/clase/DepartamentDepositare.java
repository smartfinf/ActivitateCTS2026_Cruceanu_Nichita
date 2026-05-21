package ro.ase.cts.clase;

public class DepartamentDepositare implements Departament {
    @Override
    public void notificareProcesare(PlacaLemn placa) {
        System.out.println("Depositare: Alocare spatiu pentru placa " + placa.getTipLemn() + " cu suprafata " + placa.getSuprafata() + " mp.");
    }
}

package ro.ase.cts.clase;

public class DepartamentFinanciar implements Departament {
    @Override
    public void notificareProcesare(PlacaLemn placa) {
        double costTotal = placa.getSuprafata() * placa.getCostPerMp();
        System.out.println("Financiar: Placa " + placa.getTipLemn() + " procesata. Cost estimat: " + costTotal);
    }
}

package ro.ase.cts.clase;

public class ProxyUtilaj implements IUtilaj {
    private Utilaj utilaj;
    private Hala hala;

    public ProxyUtilaj(Utilaj utilaj, Hala hala) {
        this.utilaj = utilaj;
        this.hala = hala;
    }

    public boolean verificaTemperatura() {
        return hala.getTemperaturaInterna() >= 15.0 && hala.getTemperaturaInterna() <= 30.0;
    }

    public boolean verificaConsum() {
        return hala.getConsumCurent() < hala.getConsumMaximEnergie();
    }

    public boolean verificaToateConditiile() {
        return verificaTemperatura() && verificaConsum();
    }

    public void proceseazaDoarTemperatura(PlacaLemn placa) {
        if (verificaTemperatura()) {
            utilaj.proceseazaPlaca(placa);
        } else {
            System.out.println("Eroare Acces: Temperatura neconforma. Procesarea a fost oprita.");
        }
    }

    public void proceseazaDoarConsum(PlacaLemn placa) {
        if (verificaConsum()) {
            utilaj.proceseazaPlaca(placa);
        } else {
            System.out.println("Eroare Acces: Consum energetic depasit. Procesarea a fost oprita.");
        }
    }

    @Override
    public void proceseazaPlaca(PlacaLemn placa) {
        if (verificaToateConditiile()) {
            utilaj.proceseazaPlaca(placa);
        } else {
            System.out.println("Eroare Acces: Conditii generale neindeplinite. Procesarea a fost oprita.");
        }
    }
}
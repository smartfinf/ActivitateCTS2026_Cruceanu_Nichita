package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, float calorii) {
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return null;
    }

    @Override
    public FelMancare getFelMancare() {
        return null;
    }

    @Override
    public TipDesert getTipDesert() {
        return null;
    }
}

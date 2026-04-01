package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipMancare;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, float calorii) {
        if (this.tipMancare==tipMancare)
            return new SupaDeLegume(pret,gramaj);
        else
            return new SupaDeLegume(pret,gramaj);
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if (tipMancare==tipDesert)
            return new SupaDeLegume(pret,gramaj);
        else
            return new SupaDeLegume(pret,gramaj);
        return null;
    }
}

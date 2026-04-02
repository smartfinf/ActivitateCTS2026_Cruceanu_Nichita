package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.SupaDeCiuperci;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, float calorii) {
        if (tipMancare== TipSupa.LEGUME)
            return new SupaDeLegume(pret,gramaj);
        else if(tipMancare== TipSupa.CIUPERCI)
            return new SupaDeCiuperci(pret,gramaj);
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj);
    }


}

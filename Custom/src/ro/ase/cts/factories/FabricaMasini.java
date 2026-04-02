package ro.ase.cts.factories;

import ro.ase.cts.clase.AMasina;
import ro.ase.cts.clase.Sedan;
import ro.ase.cts.clase.Suv;
import ro.ase.cts.clase.Van;
import ro.ase.cts.enums.TipMasina;

public class FabricaMasini{
    public AMasina getMasina(TipMasina tip){
        if(tip==TipMasina.SEDAN)
            return new Sedan("AB 123");
        else
            if(tip==TipMasina.SUV)
                return new Suv("AN 21");
            else if (tip==TipMasina.VAN) {
                return new Van("AR 13");
            }
        return null;
    }
}

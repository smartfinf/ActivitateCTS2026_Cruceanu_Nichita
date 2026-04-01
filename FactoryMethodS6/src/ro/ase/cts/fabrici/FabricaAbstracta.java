package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipMancare;

public interface FabricaAbstracta implements TipMancare{
    public FelMancare getFelMancare(TipMancare tipMancare,float pret,float gramaj, float calorii);
    public FelMancare getFelMancare(TipMancare tipMancare,float pret,float gramaj);
}

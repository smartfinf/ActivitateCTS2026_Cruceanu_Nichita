package ro.ase.cts.clase;

import java.util.HashMap;

public class ManagerLinie {
    private HashMap<Integer,Linie> liniiHashMap=new HashMap<>();

    public Linie getLinii(int nrLinie,String primaStatie,String ultimaStatie)
    {
        if(liniiHashMap.containsKey(nrLinie)) {
            return liniiHashMap.get(nrLinie);
        }
        else {
            Linie linie=new Linie(nrLinie,primaStatie,ultimaStatie);
            liniiHashMap.put(linie.getNrLinie(),linie);
            return linie;
        }
    }
}

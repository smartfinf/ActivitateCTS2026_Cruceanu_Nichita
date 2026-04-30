package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinie {
    Map<Integer,Linie> registru=new HashMap<>();

    public ManagerLinie(Map<Integer, Linie> registru) {
        this.registru = registru;
    }

    public Linie getLinie(int nrLinie, String ultimaStatie, String primaStatie )
    {
        if(registru.containsKey(nrLinie)) {
            return registru.get(nrLinie);
        }
        else {
        }
        registru.put(nrLinie,new Linie(primaStatie,ultimaStatie,nrLinie));
        return registru.get(nrLinie);        }
    }
}

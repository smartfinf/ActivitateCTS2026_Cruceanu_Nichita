package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinie {
    Map<Integer,Linie> registru=new HashMap<>();


    public Linie getLinie(int nrLinie, String ultimaStatie, String primaStatie)
    {
        if(registru.containsKey(nrLinie)) {
            return registru.get(nrLinie);
        }
        else{
            Linie linieNoua = new Linie(nrLinie, primaStatie, ultimaStatie);
            registru.put(linieNoua.getNrLinie(), linieNoua);
            return linieNoua;
        }
    }
}

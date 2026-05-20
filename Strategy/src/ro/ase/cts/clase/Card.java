package ro.ase.cts.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient+ " a platit card suma de "+sumaPlatita);
    }
}

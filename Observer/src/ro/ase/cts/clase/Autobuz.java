package ro.ase.cts.clase;

public class Autobuz extends MijlocDeTransport{

    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj="Autobuzul de pe linia "+super.linie+"pleaca din depou";
        notificareCalatori(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj="Autobuzul de pe linia "+super.linie+"nu poate ajunge deoarece e blocat in trafic";
        notificareCalatori(mesaj);
    }
}

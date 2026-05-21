package ro.ase.cts.clase;

public class CalatorAbonat implements Calator{
    private String nume;
    private float sold;

    public void platesteBilet(float pret)
    {
        if(sold>pret)
        {
            System.out.println(this.nume+"plateste "+pret+" pentru o calatorie");;
            sold=-pret;
        }else{
            System.out.println("Sold insuficient. mergeti pe jos");
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    @Override
    public void notificare(String nrLinie) {
        System.out.println(this.nume+" "+nrLinie+" "+" ");
    }

    public CalatorAbonat(String nume,int sold) {
        this.nume = nume;
        this.sold=sold;
    }
}

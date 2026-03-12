package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instance=null;

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }
    public static synchronized Hotel getInstance(String numeHotel,int numarCamere,int numarCamereOcupate)
    {
        if (instance==null) {
            instance=new Hotel(numeHotel,numarCamere,numarCamereOcupate);
        }
        return instance;
    }


    public void rezervaCamera(){
        if(this.numarCamereOcupate<this.numarCamere){
            System.out.println("Rezervarea a fos facuta");
            numarCamereOcupate++;
        }
        else{
            System.out.println("Nu mai exista camere disponibile!");
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("numeHotel='").append(numeHotel).append('\'');
        sb.append(", numarCamere=").append(numarCamere);
        sb.append(", numarCamereOcupate=").append(numarCamereOcupate);
        sb.append('}');
        return sb.toString();
    }
}






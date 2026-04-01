package ro.ase.cts.clase;

public class Rezervare implements RezervareAbstracta{

    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String numarTelefon) {
        if(numeClient.length()>1)
        {
            this.numeClient = numeClient;
        }
        else
            this.numeClient="Ion";
        if(oraRezervare>9&&oraRezervare<23)
        {
            this.oraRezervare = oraRezervare;
        }
        else
            this.oraRezervare=10;
        if(ziuaRezervarii>0&&ziuaRezervarii<24)
            this.ziuaRezervarii = ziuaRezervarii;
        else
            this.ziuaRezervarii=1;
     if(numarTelefon.length()==10)
        this.numarTelefon = numarTelefon;
     else
         this.numarTelefon="0700000000";
    }

    private Rezervare() {}

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        this.ziuaRezervarii = ziuaRezervarii;
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua=new Rezervare();
        rezervareNoua.numeClient=this.numeClient;
        rezervareNoua.oraRezervare=this.oraRezervare;
        rezervareNoua.numarTelefon=this.numarTelefon;
        rezervareNoua.ziuaRezervarii=this.ziuaRezervarii;

        return rezervareNoua;
    }
}

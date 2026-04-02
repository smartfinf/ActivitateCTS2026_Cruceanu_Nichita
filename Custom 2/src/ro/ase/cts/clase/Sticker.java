package ro.ase.cts.clase;

public class Sticker implements IMasina{
    private int dimensiune;

    public Sticker(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    private Sticker() {}

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public IMasina clone() {
        Sticker sticker=new Sticker();
        sticker.dimensiune=this.dimensiune;
        return sticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}

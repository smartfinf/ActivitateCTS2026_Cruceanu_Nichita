package ro.ase.cts.main;

import ro.ase.cts.clase.Sticker;


public class Main {
    public static void main(String[] args) {
        Sticker sticker1=new Sticker(1);
        Sticker sticker2=(Sticker) sticker1.clone();
        sticker2.setDimensiune(2);
        Sticker sticker3=(Sticker) sticker1.clone();
        sticker3.setDimensiune(20);
        Sticker sticker4=(Sticker) sticker1.clone();
        sticker4.setDimensiune(4);

        System.out.println(sticker1.toString());
        System.out.println(sticker2.toString());
        System.out.println(sticker3.toString());
        System.out.println(sticker4.toString());

    }
}
package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 =Hotel.getInstance("Intercontinental",7,2);
        Hotel hotel2 =Hotel.getInstance("MegaHotel",100,78);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

    }

}

package ro.ase.cts.main;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client=new Client("Marcel",new Card());
        client.plateste(20);
    }
}
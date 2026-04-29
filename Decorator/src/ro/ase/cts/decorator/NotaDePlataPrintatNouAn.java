package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{

    public NotaDePlataPrintatNouAn(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de anul nou");
    }
}

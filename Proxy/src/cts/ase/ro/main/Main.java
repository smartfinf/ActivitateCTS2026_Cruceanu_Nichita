package cts.ase.ro.main;

import cts.ase.ro.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz301=new Autobuz(4,301);
        MijlocDeTransport autobuzGol=new Autobuz(0,331);
        MijlocDeTransport autobuzSpecial=new Autobuz(0,169,TipCursa.CURSA_SPECIALA);


        Statie statieRomana=new Statie("Romana",2);
        Statie statieUniversitate=new Statie("Universitate",10);

        autobuz301.opresteInStatie(statieRomana);
        autobuzGol.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuzNoapte=new AutobuzNoapte(autobuz301);
        MijlocDeTransport autobuzNoapteGol=new AutobuzNoapte(autobuzGol);
        autobuzNoapte.opresteInStatie(statieRomana);
        autobuzNoapteGol.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuzSpecialGol=new AutobuzCursaSpeciala(autobuzGol);
        autobuzSpecialGol.opresteInStatie(statieRomana);

        MijlocDeTransport autoSpecial169=new AutobuzCursaSpeciala(autobuzSpecial);

        autoSpecial169.opresteInStatie(statieUniversitate);
    }
}
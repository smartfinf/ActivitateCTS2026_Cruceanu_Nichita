package ro.ase.cts.main;


import ro.ase.cts.clase.AdapterMedicament;
import ro.ase.cts.clase.spital.Medicament;

public class Main {
    public static void main(String[] args) {
        System.out.println("DA");

        Medicament medicament = new Medicament("KA817", 20);
        ro.ase.cts.clase.farmacie.Medicament newMedicament =
                new ro.ase.cts.clase.farmacie.Medicament("Medicament");

        medicament.achizitioneazaMedicament();
        newMedicament.cumparaMedicament();
        AdapterMedicament adapterMedicament = new AdapterMedicament(medicament);
        adapterMedicament.cumparaMedicament();
        procurareMedicament(newMedicament);
        procurareMedicament(adapterMedicament);



        newMedicament.cumparaMedicament();
        adapterMedicament.cumparaMedicament();
    }

    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medicament){
        medicament.cumparaMedicament();
    }
}
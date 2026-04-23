package ro.ase.cts.clase;


import ro.ase.cts.clase.farmacie.Medicament;

public class AdapterMedicament extends Medicament {
    private ro.ase.cts.clase.spital.Medicament medicamentSpital;

    public AdapterMedicament(ro.ase.cts.clase.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
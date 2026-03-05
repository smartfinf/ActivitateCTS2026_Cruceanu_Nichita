package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int valoareFinantareAngajat=10;

	public static void setValoareFinantareAngajat(int valoareFinantareAngajat) {
		Angajat.valoareFinantareAngajat = valoareFinantareAngajat;
	}

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public void afiseazaFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+valoareFinantareAngajat+" Euro/zi in proiect.");

	}
}

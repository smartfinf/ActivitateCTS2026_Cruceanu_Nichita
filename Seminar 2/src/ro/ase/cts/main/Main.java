package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatiReader;
import ro.ase.cts.clase.readere.AplicantReader;

public class Main{

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader aplicantReader= new AngajatiReader();
		try {
			AplicantReader angajatReader = new AngajatiReader();
			listaAngajati = angajatReader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

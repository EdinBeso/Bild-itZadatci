package zadaci08_02_2017;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
        // Skener
		Scanner unos = new Scanner(System.in);
		// Deklarisemo promjenjive
		int broj = -1;
		int najveciBroj = 0;
		int brojac = 0;
		// Petlja se vrti dok unos ne bude 0
		while(broj != 0){
			// Trazimo unos korisnika
			System.out.println("Unesite broj: ");
			// Pokupimo unos sa tastature
			broj = unos.nextInt();
			// Provjeravamo da li je uneseni broj veci od najveceg broja
			if(broj > najveciBroj){
				// Ako jest dodajemo ga na najveci broj
				najveciBroj = broj;
				// Resetujemo brojac
				brojac = 0;
			}
			// Provjeravamo da li je uneseni broj isti kao i najveci broj
			if(broj == najveciBroj){
		        // Ako jest povecavamo brojac
				brojac++;
			}
		    }
		// Ispisujemo korisniku rezultat
		System.out.println("Najveci broj je: "+najveciBroj+" ponovio se: "+brojac+" puta");
	}
}

package zadaci09_02_2017;

import java.util.Scanner;

public class RandomPitnja {

	public static void main(String[] args) {
        
		Scanner unos = new Scanner(System.in);
		// pitamo korisnika za unos
		System.out.println("Unesite broj pitanja: ");
		// pokupimo unos sa tastature
		int pitanja = unos.nextInt();
		// prosledjujemo argumente
		answer(pitanja,unos);
		
		
	    }
	public static void answer(int broj,Scanner unos){
			
		int rezultat = 0;
		int odg = 0;
		int brojac = 0;
		// petlja vrti do unosa korisnika 
		for (int i = 0; i < broj; i++) {
	    // random odabir brojeva
		int random1 = (int)(Math.random() * 10);
		int random2 = (int)(Math.random() * 10);
		// ako je prvi broj manji zamijeniti ga
		if(random1 < random2){
			int privremeno = random1;
			random1 = random2;
			random2 = privremeno;
		}
		System.out.println("Koliko iznosi: "+random1+" - "+random2+" = ");
		odg = unos.nextInt();
		rezultat = random1 - random2;
		// uslov za tacnost rezultata
		if(odg == rezultat){
			System.out.println("Vas odgovor je tacan");
			brojac++;
		}
		else{
			System.out.println("Vas odgovor nije tacan");
		}	
		}
		// konacni rezultat
		System.out.println("Ukupno je bilo: "+broj+" pitanja,a tacnih je bilo: "+brojac+" a netacnih: "+(broj-brojac));
	}
	
}

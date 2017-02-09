package zadaci08_02_2017;

import java.util.Scanner;

public class Samoglasnik {

	public static void main(String[] args) {
		
		 // Pravimo skener
		Scanner unos = new Scanner(System.in);
		// Pitamo korisnika za unos
		System.out.println("Unesite neki tekst: ");
		// Pokupiti unos sa tastature
		String text = unos.nextLine();
		// Zatvaramo skener
		unos.close();
		// Varijable za brojanje samoglasnika i slova
		int samoglasnik = 0;
		int letter = 0;
		// Petlja
		for(int i = 0;i < text.length();i++){
			// Char tip koji izdvaja karakter iz texta
			char ch = text.charAt(i);
			// Pretvaramo sva slova u velika
			ch = Character.toUpperCase(ch);
			// Provjeravamo da li je karakter samoglasnik,ako jest brojimo
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				samoglasnik++;
			}
			// Provjeravamo da li je karakter slovo,ako jest brojimo
			if(Character.isLetter(ch)){
				letter++;
			}
		    }
		// Ispisujemo korisniku koliko ima samoglasnika,a koliko suglasnika
		System.out.println("broj samoglasnika je: " + samoglasnik + " a suglasnika: " + (letter - samoglasnik));
		
	}
}

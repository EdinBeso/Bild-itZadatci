package zadaci08_02_2017;

import java.util.Scanner;

public class NajveæiZajednièkiDjelilac {

	public static void main(String[] args) {
        // Skener
		Scanner unos = new Scanner(System.in);
		// pitamo korisnika za unos
		System.out.println("Unesite prvi broj: ");
		// kupimo unos sa tastature
		int broj1 = unos.nextInt();
		System.out.println("Unesite drugi broj: ");
		int broj2 = unos.nextInt();
	    // ispisujemo korisniku rezultat
		System.out.println("Najveci zajednicki djelilac za brojeve: "+broj1+" i "+broj2+" je: "+najveciZajednickiDjelilac(broj1,broj2));
		
	        }
	// metoda
	public static int najveciZajednickiDjelilac(int num1 , int num2){
		
		int nzd = 1;
		// petlja ide unazad i provjeraje oba broja
		for (int i = num1; i > 0; i--) {
			if(num1 % 1 == 0 && num2 % i == 0){
				nzd = i;
				break;
			}
		    }
		    // vracamo rezultat
			return nzd;
		
		
		
	}
	
}







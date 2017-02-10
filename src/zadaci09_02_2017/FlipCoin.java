package zadaci09_02_2017;

import java.util.Scanner;

public class FlipCoin {
	
	public static int flipCoin(int n){
		int head = 0;
		// petlja koja ide do korinikovog unosa
		for(int i = 0; i < n;i++){
			// random odabir
			int coin = (int)(Math.random() * 2);
			// ako novcic bude jednak 1 uvecavamo glavu za jedan
			if(coin == 1){
			head++;
			}
		    }
		// na kraju vracamo vrijednost
		return head;
	        }
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		// pitamo korisnika za unos
		System.out.println("unesite koliko puta zelite baciti novcic: ");
		int number = unos.nextInt();
		// koristimo vracenu rijednost i prosledjujemo unos od korisnika
		int broj = flipCoin(number);
		// ispisujemo korisniku rezultat
		System.out.println("\nNovcic je bacen: "+number+" puta,a bilo je "+broj+" puta glava,a pismo "+(number - broj)+" puta");
		
		
		
		
	}
}

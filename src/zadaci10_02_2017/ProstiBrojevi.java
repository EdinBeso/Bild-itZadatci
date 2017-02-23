package zadaci10_02_2017;

import java.util.Scanner;

public class ProstiBrojevi {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		    }
		return true;
	        }
	public static void displayPrimes(int num1, int num2, int num3) {
		int counter = 0;
		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				counter++;
				if (counter % num3 == 0) {
					System.out.println();
				}
			    }
		        }
             	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		boolean on = true;
		int num1 = 0;
		int num2 = 0;
		int numberPerLine = 0;
		
				System.out.print("Upisite pocetni broj: ");
				num1 = unos.nextInt();
				if (num1 < 2) {
					num1 = 2;
				}
				System.out.println("Upisite krajnji broj: ");
				num2 = unos.nextInt();
				System.out.println("Koliko brojeva po liniji za ispis: ");
				numberPerLine = unos.nextInt();
				on = false;
		
		if(num2 < 2 || num1 > num2){
			System.out.println("Za trazeni unos nema prostih brojeva !");
		}
		else if(numberPerLine < 1){
			System.out.println("Broj za ispis po liniji mora biti veci od 0 !");
		}
		else{
			
		System.out.println("Prosti brojevi izmedju: " + num1 + " i: " + num2 + " prikazani sa: "
				+ numberPerLine + " u redu su: \n");
		displayPrimes(num1, num2, numberPerLine);
		}
		
		
	}
}

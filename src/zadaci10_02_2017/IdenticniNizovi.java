package zadaci10_02_2017;

import java.util.Scanner;

public class IdenticniNizovi {

			public static boolean equals(int[] niz1, int[] niz2) {
				return java.util.Arrays.equals(niz1, niz2);
			}

			public static int[] addElementsArray(int n, Scanner input) {
				int[] array = new int[n];
				System.out.print("Unesite " + n + " elemenata niza odvoji sa jedan space: ");
				for (int i = 0; i < array.length; i++) {
					array[i] = input.nextInt();
				}
				return array;
			}

			public static void main(String[] args) {

				Scanner unos = new Scanner(System.in);
				
						System.out.print("Unesite koliko elemenata 1. niza zelite: ");
						int n1 = unos.nextInt();
						int[] array1 = addElementsArray(n1, unos);

						System.out.print("Unesite koliko elemenata 2. niza zelite: ");
						int n2 = unos.nextInt();
						int[] array2 = addElementsArray(n2, unos);
						if(equals(array1,array2)){
						System.out.println("Nizovi su identicni !");
						}
						else{
							System.out.println("Nizovi nisu indeticni !");
						}
	}
}

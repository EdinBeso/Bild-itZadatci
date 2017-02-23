package zadaci10_02_2017;

import java.util.Scanner;

public class ArraySort {

		public static double min(double[] array) {
			java.util.Arrays.sort(array);
			return array[0];
		}
		public static void main(String[] args) {

			Scanner unos = new Scanner(System.in);
			double[] array = new double[10];
			
					System.out.print("Upisite 10 elemenata niza odvoji sa jedan space: ");
					for (int i = 0; i < array.length; i++) {
						array[i] = unos.nextDouble();
					}
					
			System.out.println("Min u nizu je: " + min(array));
	}
}

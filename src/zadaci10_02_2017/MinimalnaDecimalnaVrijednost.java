package zadaci10_02_2017;

import java.util.Scanner;

public class MinimalnaDecimalnaVrijednost {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int matrix = unos.nextInt();
		
		displayMatrix(matrix);
		
		public static void displayMatrix(double[][] m) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print("[" + m[j][j] + "]");
				}
				System.out.println();
			}
		}
	}
}

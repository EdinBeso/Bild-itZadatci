package zadaci09_02_2017;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite n: ");
		int n = unos.nextInt();
		matrix(n);
		
		
	}
	
	public static void matrix(int n){
		
		int[][] matrix = new int [n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print("["+matrix[i][j]+"]");
			}
			System.out.println();
		    }
	}
	
}

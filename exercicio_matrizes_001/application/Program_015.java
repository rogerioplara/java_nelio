package application;

import java.util.Scanner;

public class Program_015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		int negatives = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] < 0) {
					negatives++;
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + negatives);
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class matriz_003 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] numeros = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for (int[] linha : numeros) {
			for (int coluna : linha) {
				if (coluna < 0) {
					System.out.println(coluna);
				}
			}			
		}
		
		sc.close();
	}
}

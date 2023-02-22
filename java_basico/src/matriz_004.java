import java.util.Locale;
import java.util.Scanner;

public class matriz_004 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] numeros = new int[n][n];
		int[] soma = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
				soma[i] += numeros[i][j];
			}
		}
		
		for (int linha : soma) {
			System.out.println(linha);
		}
		
		sc.close();
	}
}

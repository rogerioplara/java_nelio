import java.util.Locale;
import java.util.Scanner;

public class matriz_002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		double[] somaLinha = new double[m];
		double[][] numeros = new double[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextDouble();
				somaLinha[i] += numeros[i][j];
			}
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(somaLinha[i]);
		}
				
		sc.close();
	}

}

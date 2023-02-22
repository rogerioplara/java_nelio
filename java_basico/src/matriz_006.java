import java.util.Locale;
import java.util.Scanner;

public class matriz_006 {

	public static void main(String[] args) {
		
		// Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] numeros = new int[n][n];
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
				
				if (j > i) {
					soma += numeros[i][j];
				}
				
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class exercicio_013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][]	numeros = new int[n][n];
		int negativos = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();	
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (numeros[i] == numeros[j]) {
					System.out.print(numeros[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		for (int[] linha : numeros) {
			for (int coluna : linha) {
				if (coluna < 0) {
					negativos++;
				}
			}
		}
		
		System.out.println("QUANTIDADE DE NEGATIVOS: " + negativos);
		
		
		
		sc.close();
	}

}

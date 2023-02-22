import java.util.Locale;
import java.util.Scanner;

public class matriz_005 {

	public static void main(String[] args) {
		
//		 Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver 
//		 empates.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] numeros = new int[n][n];
		int[] maior = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
				if (numeros[i][j] > maior[i]) {
					maior[i] = numeros[i][j];
				}
			}
		}
		
		for (int linha : maior) {
			System.out.println(linha);
		}
		
		sc.close();
	}

}

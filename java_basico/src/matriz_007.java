import java.util.Locale;
import java.util.Scanner;

public class matriz_007 {

	public static void main(String[] args) {
		
//	Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada. Depois,
//	gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais. 
//	Imprimir na tela a matriz gerada.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][]	matriz1 = new int[m][n];
		int[][]	matriz2 = new int[m][n];
		int[][]	soma = new int[m][n];
		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz1[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz2[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print(soma[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

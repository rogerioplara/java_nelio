import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// matrizes são bidimensionais, seguem basicamente todas as mesmas regras que os vetores;
		// int[][] matriz; -> declaração de uma matriz;
		// int[][] matriz = new int[n][n]; -> declaração e instranciação;
		// primeiro colchete refere-se à linha, segundo à coluna
		// matriz[1][3] -> linha 1 coluna 3;
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		// primeiro for percorre as linhas;
		//segundo for percorre as colunas;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int[] linha : mat) {
			for (int coluna : linha) {
				//imprime os valores de cada coluna em cada linha, adicionando um espaço entre os elementos;
				System.out.print(coluna + " ");
			}
			//gera a quebra de linha para cada linha percorrida
			System.out.println();
		}
		
		System.out.println();
		// também é possível fazer com um for
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

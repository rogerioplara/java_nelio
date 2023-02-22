import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// matrizes são bidimensionais, seguem basicamente todas as mesmas regras que os vetores;
		// int[][] matriz; -> declaração de uma matriz;
		// int[][] matriz = new int[n][n]; -> declaração e instranciação;
		// primeiro colchete refere-se à linha, segundo à coluna
		// matriz[1][3] -> linha 1 coluna 3;
		Scanner sc = new Scanner(System.in);
		
		int[][] numeros = new int[2][2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				numeros[i][j] = sc.nextInt();
			}
			
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(numeros[i][j]);				
			}			
		}
		
		sc.close();
	}

}

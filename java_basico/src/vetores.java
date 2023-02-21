import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		// vetores correspondem a uma coleção de dados de tamanho fixo, indexada, unidimensional e homogênea;
		// indexada: os elementos são acessados por meio de índices;
		// unidimensional: uma dimensão;
		// homogênea: todos os dados são do mesmo tipo;
		// chamados também de arranjos unidimensionais (arrays);
		// em java a primeira posição é 0;
		// um arranjo deve ser alocado previamente antes de ser utilizado. Uma vez alocado, sua quantidade de elementos é fixa;
		//vetores tem que ser declarados e instanciados;
		// int[] A; -> declaração de um vetor;
		// A = new int[10]; -> instância de um vetor;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		// loop para percorrer e preencher o vetor
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		// loop para imprimir o vetor
		for (int i = 0; i < n; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class vetor4 {
    public static void main(String[] args) {
    	
//    	Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos 
//    	elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.
    	
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] numeros = new double[n];
        double media = 0;

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextDouble();
            media += numeros[i] / n;
        }

        System.out.println(media);

        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        sc.close();
    }
}

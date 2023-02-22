import java.util.Locale;
import java.util.Scanner;

public class vetor8 {
    public static void main(String[] args) {
    	
//    	Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
//    	- a maior e a menor altura do grupo
//    	- a média de altura das mulheres
//    	- o número de homens
    	
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] alturas = new double[n];
        char[] sexos = new char[n];
        double menorAltura = 10.0;
        double maiorAltura = 0.0;
        double alturaMulheres = 0.0;
        int homens = 0;
        int mulheres = 0;

        for (int i = 0; i < n; i++) {
            alturas[i] = sc.nextDouble();
            sexos[i] = sc.next().charAt(0);

            if (sexos[i] == 'F') {
                alturaMulheres += alturas[i];
                mulheres++;
            } else {
                homens++;
            }
        }

        for (double altura : alturas) {
            if (maiorAltura < altura){
                maiorAltura = altura;
            }
        }

        for (double altura : alturas) {
            if (altura < menorAltura){
                menorAltura = altura;
            }
        }

        double mediaAlturaMulheres = alturaMulheres / mulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d", homens);

        sc.close();
    }
}

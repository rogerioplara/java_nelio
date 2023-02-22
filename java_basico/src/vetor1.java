import java.util.Locale;
import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {
    	
//    	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número 
//    	do vetor (supor não haver empates). Mostrar também a posição do maior elemento
    	
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int posicao = 0;
        double[] vet = new double[n];
        double maior = 0;

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextDouble();
            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}

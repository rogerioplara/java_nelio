import java.util.Locale;
import java.util.Scanner;

public class exercicio_011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma, media;
        soma = 0.0;
        media = 0.0;
        double[] vet = new double[n];

        for (int i = 0; i < n; i++){
            vet[i] = sc.nextDouble();
            System.out.print(vet[i] + " ");
            soma += vet[i];
            media = soma / n;
        }

        System.out.printf("%n%.2f%n%.2f%n", soma, media);

        sc.close();
    }
}

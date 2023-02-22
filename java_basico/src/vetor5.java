import java.util.Locale;
import java.util.Scanner;

public class vetor5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];
        int pares = 0, somaPares = 0;

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                somaPares += numeros[i];
                pares++;
            }
        }

        double media = (double) somaPares / pares;

        System.out.printf("%.1f%n", media);

        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class vetor7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        double media;

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            media = (notas1[i] + notas2[i]) / 2;
            if (media >= 6) {
                System.out.printf("%s%n", nomes[i]);
            }
        }

        sc.close();
    }
}

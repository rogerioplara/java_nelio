import java.util.Locale;
import java.util.Scanner;

public class exercicio_012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] vetNome = new String[n];
        int[] vetIdade = new int[n];
        double[] vetAltura = new double[n];

        double mediaAltura = 0.0;
        double mediaAlturaFinal;
        double menor = 0;
        double menorTotal;

        for (int i = 0; i < n; i++) {
            vetNome[i] = sc.next();
            vetIdade[i] = sc.nextInt();
            vetAltura[i] = sc.nextDouble();
            sc.nextLine();

            mediaAltura += vetAltura[i];

            if (vetIdade[i] < 16) {
                menor++;
            }
        }

        menorTotal = (menor / n) * 100;
        mediaAlturaFinal = mediaAltura / n;
        System.out.printf("Altura media: %.2f%n", mediaAlturaFinal);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menorTotal);

        sc.close();
    }
}

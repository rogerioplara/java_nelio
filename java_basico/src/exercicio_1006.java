import java.util.Locale;
import java.util.Scanner;

public class exercicio_1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;
        int pesoTotal = pesoA + pesoB + pesoC;

        double media = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / pesoTotal;

        System.out.printf("MEDIA = %.1f%n", media);
        
        sc.close();
    }
}

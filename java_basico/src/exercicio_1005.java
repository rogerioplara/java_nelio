import java.util.Locale;
import java.util.Scanner;

public class exercicio_1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;
        double pesoTotal = pesoA + pesoB;

        double mediaA = A * pesoA;
        double mediaB = B * pesoB;
        double mediaFinal = (mediaB + mediaA) / pesoTotal;

        System.out.printf("MEDIA = %.5f%n", mediaFinal);
        
        sc.close();
    }
}

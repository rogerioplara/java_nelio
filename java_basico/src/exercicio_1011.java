import java.util.Locale;
import java.util.Scanner;

public class exercicio_1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double volume =(pi * (Math.pow(raio, 3))) * (4.0 / 3.0);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }

}

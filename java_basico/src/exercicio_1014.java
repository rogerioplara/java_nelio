import java.util.Locale;
import java.util.Scanner;

public class exercicio_1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        double y, consumo;

        x = sc.nextInt();
        y = sc.nextDouble();

        consumo = x / y;

        System.out.printf("%.3f km/l%n", consumo);

        sc.close();
    }
}

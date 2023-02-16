import java.util.Locale;
import java.util.Scanner;

public class exercicio_1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hours, speed, x;
        double total, distance;

        x = 12;

        hours = sc.nextInt();
        speed = sc.nextInt();

        distance = speed * hours;
        total = distance / x;

        System.out.printf("%.3f%n", total);

        sc.close();
    }

}

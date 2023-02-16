import java.util.Locale;
import java.util.Scanner;

public class exercicio_1009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();
        double comission = 0.15;

        double totalPay = (sales * comission) + salary;

        System.out.printf("TOTAL = R$ %.2f%n", totalPay);

        sc.close();
    }

}

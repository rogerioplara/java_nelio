import java.util.Locale;
import java.util.Scanner;

public class exercicio_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, hours;
        double hrWage, salary;

        id = sc.nextInt();
        hours = sc.nextInt();
        hrWage = sc.nextDouble();

        salary = hours * hrWage;

        System.out.printf("NUMBER = %d%n", id);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}

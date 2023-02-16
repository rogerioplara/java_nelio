import java.util.Locale;
import java.util.Scanner;

public class exercicio_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int p1, p2, qt1, qt2;
        double pc1, pc2, total;

        p1 = sc.nextInt();
        qt1 = sc.nextInt();
        pc1 = sc.nextDouble();
        sc.nextLine();
        p2 = sc.nextInt();
        qt2 = sc.nextInt();
        pc2 = sc.nextDouble();

        total = (qt1 * pc1) + (qt2 * pc2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }

}

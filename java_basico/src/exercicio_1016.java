import java.util.Scanner;

public class exercicio_1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt();

        int time = speed * 2;

        System.out.printf("%d minutos%n", time);

        sc.close();
    }
}

import java.util.Scanner;

public class exercicio_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
        // quando pedir para finalizar a linha, necessário utilizar o println;

        sc.close();
    }
}

import java.util.Scanner;

public class operadores_bitwise {
    public static void main(String[] args) {
        // operador & -> E bit a bit (and)
        // operador | -> OU bit a bit (or)
        // operador ^ -> OU-EXCLUSIVO bit a bit (xor)
        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println();

        int mask = 32; // tem apenas o sexto bit valendo 1 -> 0b1000000;
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

    }
}

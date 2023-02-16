import java.util.Scanner;

public class exercicio_1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB, maior;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior", maior);

        sc.close();
    }
}

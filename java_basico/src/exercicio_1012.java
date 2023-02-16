import java.util.Locale;
import java.util.Scanner;

public class exercicio_1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, pi, triangulo, circulo, trapezio, quadrado, retangulo;

        pi = 3.14159;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c) / 2.0;
        circulo = pi * Math.pow(c, 2.0);
        trapezio = ((a + b) / 2.0) * c;
        quadrado = Math.pow(b, 2.0);
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}

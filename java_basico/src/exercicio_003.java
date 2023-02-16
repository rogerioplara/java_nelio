import java.util.Locale;
import java.util.Scanner;

public class exercicio_003 {
    // area = base * altura
    // perimetro = 2*base + 2*altura
    // diagonal = raiz base^2 + altura^2
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;
        base = sc.nextDouble();
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2.0 * (base + altura);
        diagonal = Math.sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        sc.close();
    }

}

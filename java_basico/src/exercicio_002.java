import java.util.Locale;
import java.util.Scanner;

public class exercicio_002 {
    public static void main(String[] args) {
        // medir as medidas da largura e comprimento de um terreno retangular com uma
        // casa decimal e o valor do metro quadrado com 2 casas decimais. Mostar o valor
        // da área do terreno, valor do preço do terreno com duas casas decimais;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double precoMetro = sc.nextDouble();

        double area = largura * comprimento;
        double preco = precoMetro * area;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f", preco);

        sc.close();
    }
}

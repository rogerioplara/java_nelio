import java.util.Locale;
import java.util.Scanner;

public class exercicio_1002 {
    public static void main(String[] args) {
        //area = n . raio^2
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n * (Math.pow(raio, 2));

        System.out.printf("A=%.4f%n", area);

        sc.close();   
    }
}


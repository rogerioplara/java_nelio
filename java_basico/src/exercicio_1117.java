import java.util.Locale;
import java.util.Scanner;

public class exercicio_1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = sc.nextDouble();
		while (nota1 < 0.00 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		
		nota2 = sc.nextDouble();
		while (nota2 < 0.00 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2;
		System.out.printf("media = %.2f%n", media);
		
		sc.close();
	}

}

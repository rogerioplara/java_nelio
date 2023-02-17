import java.util.Locale;
import java.util.Scanner;

public class exercicio_005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, notaFinal;
			
		System.out.println("Digite a primeira nota");
		a = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		b = sc.nextDouble();
		
		notaFinal = (double)a + b;
		
		if (notaFinal < 60.0) {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		} else {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			System.out.println("APROVADO");
		}
		
		sc.close();
	}

}

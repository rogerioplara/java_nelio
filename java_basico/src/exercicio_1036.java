import java.util.Locale;
import java.util.Scanner;

public class exercicio_1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, r1, r2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (a == 0 || delta < 0.0) {	
			System.out.println("Impossivel calcular");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}

		sc.close();
	}

}

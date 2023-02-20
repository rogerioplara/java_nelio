import java.util.Locale;
import java.util.Scanner;

public class exercicio_1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double x, y, resultado;
		
		for (int i = 0; i < n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if (y == 0) {
				System.out.println("divisao impossivel");				
			} else {
				resultado = x / y;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
	}

}

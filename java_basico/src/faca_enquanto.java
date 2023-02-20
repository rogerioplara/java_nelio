import java.util.Locale;
import java.util.Scanner;

public class faca_enquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		String menu;
		
		//executa primeiro e depois faz a verificação
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = ((9.0 * c) / 5.0) + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			
			System.out.print("Deseja repetir (s/n)? ");
			menu = sc.next();
			
		} while (menu.equals("s"));
		
		sc.close();
	}

}

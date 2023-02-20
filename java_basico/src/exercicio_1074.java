import java.util.Locale;
import java.util.Scanner;

public class exercicio_1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0 && num > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (num % 2 != 0 && num > 0) {
				System.out.println("ODD POSITIVE");
			} else if (num % 2 == 0 && num < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (num % 2 != 0 && num < 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}
		
		sc.close();
	}

}

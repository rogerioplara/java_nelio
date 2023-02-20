import java.util.Locale;
import java.util.Scanner;

public class exercicio_1078 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int tabuada = i * n; 
			System.out.printf("%d x %d = %d%n", i, n, tabuada);			
		}
		
		sc.close();
	}

}

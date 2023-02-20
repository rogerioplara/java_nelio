import java.util.Locale;
import java.util.Scanner;

public class exercicio_1159 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		x = sc.nextInt();
		
		while (x != 0) {
			if (x % 2 == 0) {
				int soma1 = x;
				int soma2 = soma1 + 2;
				int soma3 = soma2 + 2;
				int soma4 = soma3 + 2;
				int soma5 = soma4 + 2;
				soma = soma1 + soma2 + soma3 + soma4 + soma5;
				System.out.println(soma);
			} else {
				int soma1 = x + 1;
				int soma2 = soma1 + 2;
				int soma3 = soma2 + 2;
				int soma4 = soma3 + 2;
				int soma5 = soma4 + 2;
				soma = soma1 + soma2 + soma3 + soma4 + soma5;
				System.out.println(soma);
			}
			x = sc.nextInt();
		}
		
		sc.close();
	}

}

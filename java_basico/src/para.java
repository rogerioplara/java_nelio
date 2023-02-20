import java.util.Locale;
import java.util.Scanner;

public class para {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, soma = 0;
		
		System.out.println("Digite quantos números irá somar:");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			soma += sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

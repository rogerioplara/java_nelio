import java.util.Locale;
import java.util.Scanner;

public class exercicio_1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, contador, total;
		double media;
		contador = 0;
		total = 0;		
		
		idade = sc.nextInt();
		while (idade >= 0) {
			total += idade;
			contador++;
			idade = sc.nextInt();
		}
		
		media = (double) total / contador;
		
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}

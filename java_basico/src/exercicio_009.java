

import java.util.Locale;
import java.util.Scanner;

public class exercicio_009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, qtdIdade;
		double idadeTotal;
		
		idade = sc.nextInt();
		idadeTotal = 0;
		qtdIdade = 0;
		
		while (idade >= 0) {
			idadeTotal += idade;
			qtdIdade++;
			idade = sc.nextInt();
		}
		
		if (qtdIdade > 0) {
			double media = (double) idadeTotal / qtdIdade;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("impossivel calcular");
		}
		
		sc.close();
	}

}

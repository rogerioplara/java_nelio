import java.util.Locale;
import java.util.Scanner;

public class exercicio_004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.next();
		int age1 = sc.nextInt();
		String name2 = sc.next();
		int age2 = sc.nextInt();
		
		//cálculo feito com variáveis inteiras, precisa colocar variáveis do tipo double
		double avg = (double)(age1 + age2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos%n", name1, name2, avg);
		
		sc.close();
	}

}

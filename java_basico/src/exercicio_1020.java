import java.util.Locale;
import java.util.Scanner;

public class exercicio_1020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, ano, mes, dia, resto;
		
		n = sc.nextInt();
		
		ano = n / 365;
		resto = n % 365;
		mes = resto / 30;
		dia = resto % 30;
		
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", dia);
		
		sc.close();
	}

}

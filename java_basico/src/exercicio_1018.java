import java.util.Locale;
import java.util.Scanner;

public class exercicio_1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto100, resto50, resto20, resto10, resto5;
		
		n = sc.nextInt();
		
		nota100 = n / 100;
		resto100 = n % 100;
		
		nota50 = resto100 / 50;
		resto50 = resto100 % 50;
		
		nota20 = resto50 / 20;
		resto20 = resto50 % 20;
		
		nota10 = resto20 / 10;
		resto10 = resto20 % 10;
		
		nota5 = resto10 / 5;
		resto5 = resto10 % 5;
		
		nota2 = resto5 / 2;
		nota1 = resto5 % 2;
		
		System.out.printf("%d%n", n);
		System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
		System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
		System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
		System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
		System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
		System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
		System.out.printf("%d nota(s) de R$ 1,00%n", nota1);
		
		sc.close();
	}

}

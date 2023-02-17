import java.util.Scanner;

public class exercicio_1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (a != b) {
			if (a > b) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			//necessário adicionar esse passo;
			a = sc.nextInt();
			b = sc.nextInt();
		}

		sc.close();
	}

}

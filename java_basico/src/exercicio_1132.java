import java.util.Scanner;

public class exercicio_1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, min, max, soma;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			min = y;
			max = x;
		} else {
			min = x;
			max = y;
		}
		
		soma = 0;
		for (int i = min; i <= max; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

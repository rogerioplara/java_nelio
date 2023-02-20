import java.util.Locale;
import java.util.Scanner;

public class exercicio_1071 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		// verificar primeiro qual é o menor entre os 2
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		// percorrer os números entre o que foi informado, somando somente os ímpares
		int soma = 0;
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

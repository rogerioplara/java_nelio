import java.util.Locale;
import java.util.Scanner;

public class exercicio_010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}

		sc.close();
	}

}

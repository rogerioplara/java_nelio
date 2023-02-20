import java.util.Locale;
import java.util.Scanner;

public class exercicio_1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, in, out, entry;
		n = sc.nextInt();
		
		in = 0;
		out = 0;
		
		for (int i = 0; i < n; i++) {
			entry = sc.nextInt();
			if (entry >= 10 && entry <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		
		sc.close();
	}

}

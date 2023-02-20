import java.util.Locale;
import java.util.Scanner;

public class exercicio_1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double m1, m2, m3, media;
		
		for (int i = 0; i < n; i++) {
			m1 = sc.nextDouble();
			m2 = sc.nextDouble();
			m3 = sc.nextDouble();
			sc.nextLine();
			
			media = ((m1 * 2.0) + (m2 * 3.0) + (m3 * 5.0)) / 10.0;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}

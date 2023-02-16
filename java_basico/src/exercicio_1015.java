import java.util.Locale;
import java.util.Scanner;

public class exercicio_1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distance;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		sc.nextLine();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("%.4f%n", distance);
		
		sc.close();
	}

}

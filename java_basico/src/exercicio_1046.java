import java.util.Locale;
import java.util.Scanner;

public class exercicio_1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hin, hend, duration;
		
		hin = sc.nextInt();
		hend = sc.nextInt();
		
		if (hin < hend) {
			duration = hend - hin;
		} else {
			duration = 24 - hin + hend;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duration);
		
		sc.close();
	}

}

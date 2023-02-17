import java.util.Locale;
import java.util.Scanner;

public class exercicio_1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//a partir de um tempo em segundos, como fazer o cálculo para definir em segundos
		//140153 segundos contém quantas horas?
		//140153 / 3600 = 38,931388...
		// 38*3600 = 136800 - 140153 = 3353 segundos de sobra
		// 3353/60 = 55,88333...
		// 55 * 60 = 3300 - 3353 = 53 segundos;
		
		int n, resto, horas, minutos, segundos;
		n = sc.nextInt();
		
		horas = n / 3600;
		resto = n % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);	
		
		sc.close();
	}

}

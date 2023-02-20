import java.util.Locale;
import java.util.Scanner;

public class exercicio_1114 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int password;
		password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Senha Invalida");
			password = sc.nextInt();
		}
		
		if (password == 2002) {
			System.out.println("Acesso Permitido");
		}
		
		sc.close();
	}

}

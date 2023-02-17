import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		// estrutura de controle para direcionar o fluxo do programa dependendo da condição V ou F;
		// if (<condição>) { <comando 1> <comando 2> }
		// else { <comando 3> <comando 4> }
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}

}

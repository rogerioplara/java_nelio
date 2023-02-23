import java.util.Scanner;

public class funcoes_sintaxe {

	public static void main(String[] args) {
		/*
		Representam um processamento que possui significado
		- Math.sqrt(double)
		- System.out.println();
		- pode receber um dado como argumento/parametro e pode retornar uma resposta;
		
		Principas vantagens: modularização, delegação e reaproveitamento;
		
		Dados de entrada e saída
		- funções podem receber dados de entrada (parâmetros ou argumentos)
		- funções podem ou não retornar uma saída
		
		Em orientação a objetos, funções em classes recebem o nome de métodos;
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// funções que vamos criar para serem reutilizadas;
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	//prefixos para a função:
	//public -> fica disponível em outras classes;
	//static -> faz com que possa ser chamada independente de criar um objeto;
	//int -> tipo que será retornado pela função;
	public static int max(int x, int y, int z) {
		//variavel local da função, existe somente dentro do escopo dessa função;
		//quando a função acaba, as variáveis são desalocadas
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	//quando a função faz uma ação e não retorna valor para ser utilizado, utiliza-se void
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}

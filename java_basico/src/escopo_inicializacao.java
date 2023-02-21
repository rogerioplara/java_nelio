

public class escopo_inicializacao {

	public static void main(String[] args) {
		// escopo de uma variável é onde uma variável é válida, onde pode ser válida;
		//uma variável não pode ser usada se não for iniciada;
		
		double price = 400.00;
		System.out.println(price);
		
		double discount = 0;
		if (price < 200.00) {
			discount = price * 0.1;
		}
		
		System.out.println(discount); // para utilizar a variável fora da estrutura, é necessário inicia-la fora;

	}

}


public class Boxing_unboxing_wrapper {

	public static void main(String[] args) {
		
		/*
		 * Todas as classes, por padrão, são filhas da classe Object;
		 * 
		 * Boxing:
		 * 	- processo de conversão de um objeto tipo valor para um objeto tipo referência compatível;
		 * 
		 * Unboxing:
		 * 	- processo de conversão de um objeto tipo referência para um bjeto tipo valor compatível;
		 * 
		 * Wrapper classes
		 *	- são classes equivalentes aos tipos primitivos;
		 *	- boxing e unboxing é natural na linguagem;
		 *	- uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
		 *	- trata tipos primitivos como classes;
		 *	- classes aceitam valor numm e usufruem dos recursos da oo;
		 */
		
		//boxing
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		//unboxing
		int y = (int)obj;
		System.out.println(y);

	}

}

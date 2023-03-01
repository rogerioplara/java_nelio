
public class Foreach {

	public static void main(String[] args) {
		
		/*
		 * foreach para percorrer coleções
		 * 
		 * sintaxe:
		 * 
		 * for (Tipo apelido : coleção) {
		 * 		<Comandos>
		 * }
		 */

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
	
		System.out.println();
		
		//para cada objeto do tipo String name contido no vetor vect, faça
		for (String name : vect) {
			System.out.println(name);
		}
		
	}

}

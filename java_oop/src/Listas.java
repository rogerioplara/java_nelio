import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		/*
		 * Listas
		 * 
		 * Lista é uma estrutura de dados: - homogênea (dados do mesmo tipo); - ordenada
		 * (elementos acessados por meio de posições); - inicia vazia e seus elementos
		 * são alocadas sob demanda; - Cada elemento ocupa um nó (node) da lista;
		 * 
		 * Tipo (interface): List
		 * 
		 * Classes que implementam: - ArrayList, LinkedList, etc;
		 * 
		 * Vantagens: - tamanho variável - facilidades para se realisar inserções e
		 * deleções
		 * 
		 * Desvantagens: - Acesso sequencial aos elementos;
		 * 
		 * Tamanho da lista: size();
		 * 
		 * Inserir elemento na lista: add(obj), add(int, obj)
		 * 
		 * Remover elemento da lista: remove(obj), remove(int), removeIf(Predicate)
		 * 
		 * Encontrar posição de elemento: indexOf(obj), lasIndexOf(obj)
		 * 
		 * Filtrar lista com base em predicado: List<Integer> result =
		 * list.stream().filter(x -> x > 4).collect(Collectors.tolist());
		 * 
		 * Encontrar primeira ocorrência com base em predicado: Integer result =
		 * list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 */

		// listas não aceitam tipos primitivos, usar wrapper class;

		// criação da lista = instanciação da lista;
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// inserir novo elemento na posição 2
		list.add(2, "Marco");

		// verificar o tamanho da lista
		System.out.println(list.size());

		// imprimir a lista
		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("----------------");

		// remover elemento da lista por indice, valor ou predicado
		list.remove("Anna");
		list.remove(1);

		// função lambda
		// remova, se(x na posição 0 é igual a M)
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("----------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		// quando o indexOf() não encontra o elemento, retorna -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("----------------");

		list.add("Anna");
		list.add("Alex");

		// filtrar a lista e deixar somente os que atenderem ao meu predicado
		// recebe o resultado de = converte para stream.faz a operação de filtragem
		// baseado na condição lambda.converte novamente para lista;
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String name : result) {
			System.out.println(name);
		}

		System.out.println("----------------");

		// encontrar o primeiro elemento que atenda a um predicado
		// atribui a variavel name = converte para stream.faz a operação de filtragem
		// baseada na condição lambda.encontra o primeiro.se não encontrar retorna null;

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(name);

		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

		System.out.println(name);

	}

}

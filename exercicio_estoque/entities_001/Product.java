package entities_001;

public class Product {

	// ENCAPSULAMENTO
	// setando os atributos para PRIVATE, o acesso a eles fica restrito, obrigando a
	// criação e utilização de métodos GETTER E SETTER;
	private String name;
	private double price;
	private int quantity;

	// também é possível manter o construtor padrão do java
	public Product() {
		// dessa forma o java atribuirá aos atributos o valor padrão
		// string = null
		// double = 0.0
		// int = 0
	}

	// INCLUSÃO DO CONSTRUTOR;
	// em Java, feito após os atributos antes dos métodos;
	// por convenção, utilizamos os mesmos nomes dos atributos para os parâmetros do
	// construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// é possível criar construtores para atributos específicos, nem todos precisam
	// ser iniciados. Também é possível criar mais de um método construtor, chamado
	// de SOBRECARGA;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// método setter para alterar o atributo name;
	public void setName(String name) {
		this.name = name;
	}

	// método getter para pegar o atributo name;
	public String getName() {
		return name;
	}

	// método getter para pegar o atributo price;
	public double getPrice() {
		return price;
	}

	// método setter para alterar o atributo price;
	public void setPrice(double price) {
		this.price = price;
	}
	
	//método getter para pegar o atributo quantity;
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// para referenciar o atributo da classe, usar "this."
		// soma o argumento ao atributo da classe
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		// sobrepõe a função nativa toString para esse objeto, retornando aquilo que for
		// definido quando a classe for chamada;
		return String.format("%s, %.2f, %d units, Total: $ %.2f%n", name, price, quantity, totalValueInStock());
	}
}

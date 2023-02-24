package entities_001;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		//para referenciar o atributo da classe, usar "this."
		//soma o argumento ao atributo da classe
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		//sobrepõe a função nativa toString para esse objeto, retornando aquilo que for definido quando a classe for chamada;
		return String.format("%s, %.2f, %d units, Total: $ %.2f%n", 
				name, 
				price, 
				quantity, 
				totalValueInStock());
	}
}

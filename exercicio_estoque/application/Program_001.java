package application;

import java.util.Locale;
import java.util.Scanner;

import entities_001.Product;

public class Program_001 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		// passar os parametros como argumento na instanciação do objeto -> processo
		// feito ANTES da instanciação do objeto;
		Product product = new Product(name, price);

		// forma de utilizar o setter para alterar o atributo name
		product.setName("Computer");
		System.out.printf("Updated name: %s%n", product.getName());
		product.setPrice(1200.00);
		System.out.printf("Updated price: %.2f%n", product.getPrice());

		System.out.println("Product data: " + product);

		System.out.print("Enter the number of products to be added in stock: ");
		// product.addProducts(sc.nextInt());
		// ATENÇÃO - se utilizar dessa forma, não será possível fazer nenhum tratamento
		// nos dados de entrada - se for necessário utilizar o valor passado
		// posteriormente:
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("Updated data: " + product);

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("Updated data: " + product);

		sc.close();
	}

}

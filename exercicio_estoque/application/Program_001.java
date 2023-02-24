package application;

import java.util.Locale;
import java.util.Scanner;

import entities_001.Product;

public class Program_001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		//product.addProducts(sc.nextInt());
		//ATENÇÃO - se utilizar dessa forma, não será possível fazer nenhum tratamento nos dados de entrada - se for necessário utilizar o valor passado posteriormente:
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

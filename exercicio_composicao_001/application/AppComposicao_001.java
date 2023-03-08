package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Order_001;
import entities.Product_001;
import entities.enums.OrderStatus_001;

public class AppComposicao_001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birth = sc.next();
		LocalDate birthDate = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order_001 order = new Order_001(LocalDateTime.now(), OrderStatus_001.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Product_001 product = null;
		OrderItem orderItem = null;
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data: %n", i);
			System.out.print("Product name: ");
			String name1 = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			product = new Product_001(name1, price);
			orderItem = new OrderItem(quantity, price);
			orderItem.subTotal(quantity, price);
			
			order.addItem(orderItem);			
		}
		
		System.out.println("ORDER SUMARY: ");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail());
		System.out.println("Order items: ");
		for (OrderItem item : order.getItem()) {
			System.out.println(product.getName() + " " + product.getPrice() + " " + orderItem.getQuantity() + " " + orderItem.subTotal(orderItem.getQuantity(), orderItem.getPrice()));
		}
		
		
		//finalizando, falta mostrar os dados e utilizar o StringBuilder e percorrer a lista de produtos;
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_008 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em um vetor. Em seguida mostrar o preço médio dos produtos;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//forma de instanciar um vetor de objetos;
		Product[] vect = new Product[n];	
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine(); //consumir a quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			//referenciando o objeto e armazenando nos índices;
			vect[i] = new Product(name, price);	
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program_006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double total = CurrencyConverter.converter(price, amount);
		
		System.out.printf("Amount to be paid in Reais = %.2f%n", total);
		
		sc.close();
	}

}

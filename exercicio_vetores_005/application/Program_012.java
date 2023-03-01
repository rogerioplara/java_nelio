package application;

import java.util.Scanner;

import entities.Number;

public class Program_012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Number[] numbers = new Number[n];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			numbers[i] = new Number(number);
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (Number number : numbers) {
			int num = number.getNumbers();
			if (num < 0) {
				System.out.println(num);
			}
		}
				
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program_009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 
		
		System.out.print("Quantas pessoas serão inseridas? ");
		int n = sc.nextInt();
		sc.nextLine();
		int count = 1;
		
		Person[] vect = new Person[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: ", count);
			System.out.println();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			count++;
			
			vect[i] = new Person(name, age, height);
		}
		
		double avg = 0;
		double underage = 0;
		
		for (int i = 0; i < vect.length; i++) {
			avg += vect[i].getHeight() / vect.length;
			if (vect[i].getAge() < 16) {
				underage++;
			}
		}
		
		double amountUnderage = (underage / vect.length) * 100;
		
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", amountUnderage);
		
		for (Person person : vect) {
			if (person.getAge() < 16) {
				System.out.println(person.getName());
			}
		}
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person_001;

public class Program_010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão inseridas? ");
		int n = sc.nextInt();
		int count = 1;
		int older = 0;
		String oldest = null;

		Person_001[] vect = new Person_001[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: %n", count);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			count++;

			vect[i] = new Person_001(name, age);
		}

		for (Person_001 person_001 : vect) {
			if (person_001.getAge() > older) {
				older = person_001.getAge();
				oldest = person_001.getName();
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s%n", oldest);

		sc.close();
	}

}

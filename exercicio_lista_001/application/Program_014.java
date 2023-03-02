package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program_014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many empoyees will be registered: ");
		int n = sc.nextInt();	
		
		//instancia da lista;
		List<Funcionarios> func = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			//iniiando o objeto;
			Funcionarios funcionario = new Funcionarios(id, name, salary);
			
			//adicionando a lista;
			func.add(funcionario);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");		
		Integer idSearch = sc.nextInt();
		
		System.out.println("Enter increase percentage: ");
		Double percentage = sc.nextDouble();
		
		
		sc.close();
	}

}
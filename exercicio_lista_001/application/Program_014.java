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
		List<Funcionarios> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			//iniciando o objeto;
			Funcionarios funcionario = new Funcionarios(id, name, salary);
			
			//adicionando a lista;
			list.add(funcionario);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");		
		Integer idSearch = sc.nextInt();
		
		//minha solução
		for (Funcionarios funcionario : list) {
			if (idSearch.equals(funcionario.getId())) {
				System.out.print("Enter increase percentage: ");
				Double percentage = sc.nextDouble();
				funcionario.increaseSalary(percentage);
				System.out.print(funcionario);
			} else {
				System.out.println("This id does not exist!");
				break;
			}
		}
		
		//solução do professor
//		Integer pos = position(list, idSearch);
//		if (pos == null) {
//			System.out.println("This id does not exist!");
//		} else {
//			System.out.print("Enter increase percentage: ");
//			Double percentage = sc.nextDouble();
//			
//			list.get(pos).increaseSalary(percentage);
//		}
//		
//		System.out.println();
			
		sc.close();
	}
	
	//função auxiliar para encontrar o ID na lista;
//	public static Integer position(List<Funcionarios> list, int idSearch) {
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getId() == idSearch) {
//				return i;
//			}
//		}
//		
//		return null;
//	}

}
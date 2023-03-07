package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class AppComposicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		//instância do meu objeto worker com todos os construtores.
		//name = workerName
		//level = enum WorkerLevel recebendo o valor da variavel workerLevel
		//baseSalary = baseSalary
		//department = novo objeto Department recebendo como parâmetro a variável departmentName
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department (departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter contract #%d data: %n", i);
			// receber a data como string e converter para LocalDate;
			System.out.print("Date (DD/MM/YYYY): ");
			String data1 = sc.next();
			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			//recebendo o valor de cada hora do contrato
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			//recebendo a duração de cada contrato
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//instanciando o objeto contrato com os parâmetros recebidos
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//adiciona o contrato em cada volta do for
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.printf("Name: %s%n", worker.getName());
		System.out.printf("Department: %s%n", worker.getDepartment().getName());
		System.out.printf("Income for %s: %.2f%n", monthAndYear, worker.income(year, month));
			
		sc.close();
	}

}

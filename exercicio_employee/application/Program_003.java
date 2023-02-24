package application;

import java.util.Locale;
import java.util.Scanner;

import entities_003.Employee;

public class Program_003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		
		System.out.print("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		emp.increaseSalary(increase);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		
		sc.close();
	}

}
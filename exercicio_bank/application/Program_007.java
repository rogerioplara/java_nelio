package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program_007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		Bank bank = new Bank(accountNumber, name);
		bank.setAccountNumber(accountNumber);
		bank.setName(name);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			bank.deposit(balance);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.print("Enter deposit value: ");
		double deposit = sc.nextDouble();
		bank.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
			
		System.out.print("Enter a withdaw value: ");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		sc.close();
	}

}

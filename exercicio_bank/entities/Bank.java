package entities;

public class Bank {

	private int accountNumber;
	private String name;
	private double balance;

	public Bank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	private double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		double tax = 5.00;
		this.balance -= amount + tax;
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n",
				getAccountNumber(), 
				getName(), 
				getBalance());
	}
	
	
}

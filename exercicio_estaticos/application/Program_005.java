package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program_005 {
	
	//declaração de um membro estático na classe
	//public static final double PI = 3.14159;
	//essa estrutura declara uma constante, esse valor não será mais alterado (final)
	//padrão de nomes para constantes: tudo maiúsculo e separado por underline, ex: PI_VALUE

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
		
		System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
		
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//	
//	public static double volume(double radius) {
//		return (4.0 * PI * Math.pow(radius, 3)) / 3;
//	}

}

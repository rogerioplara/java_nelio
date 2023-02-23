package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    
	public static void main(String[] args) {
        // resolvendo um problema sem oop
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//new é uma alocação dinâmica de memória, objeto instânciado na área de memória Heap
		//as variáveis comuns são criadas na memória Stack
		//a variável comum faz um ponteiro para a variável dinâmica na memória Heap
		Triangle x, y;
		x = new Triangle(); // objetos -> instâncias da classe
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		//leitura dos dados e armazenando em cada instância do objeto x, com 
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
    }
}

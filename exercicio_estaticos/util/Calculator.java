package util;

public class Calculator {
	
	/*
	 * 3 versões de resolução do problema
	 * versão 1: métodos na própria classe do programa
	 * 	- dentro de um método estático não pode chamar membros de instância da mesma classe;
	 * 
	 * versão 2: classe calculator com membros de instância
	 * 
	 * versão 3: classe calculator com método estático
	 * 
	 */
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3;
	}

}

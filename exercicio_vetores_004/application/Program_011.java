package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Approved;

public class Program_011 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
//		no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
//		os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
//		igual a 6.0 (seis). 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão inseridos? ");
		int n = sc.nextInt();
		int count = 1;
		
		Approved[] approved = new Approved[n];
		
		for (int i = 0; i < approved.length; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %do aluno: %n", count);
			sc.nextLine();
			String name = sc.nextLine();
			double firstGrade = sc.nextDouble();
			double secondGrade = sc.nextDouble();
			count++;
			
			approved[i] = new Approved(name, firstGrade, secondGrade);
		}
		
		double avg = 0;
		
		System.out.println("Alunos Aprovados: ");
		for (Approved student : approved) {
			avg = (student.getFirstGrade() + student.getSecondGrade()) / 2;
			if (avg >= 6.0) {
				System.out.println(student.getName());
			}
		}
		
		sc.close();
	}

}

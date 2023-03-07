package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department; //um departamento
	private List<HourContract> contracts = new ArrayList<>(); //para muitos -> instância da lista de contratos do trabalhador;
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	//métodos de adição e remoção dos contratos na lista -> remover o construtor setContracts();
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		//instancia do salário base para iniciar a soma
		double sum = baseSalary;
		
		//loop para percorrer a lista pegando os valores de ano e mês e jogando nas variáveis correspondentes;
		for (HourContract c : contracts) {
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();
			
			//checando se o valor de ano e mês correspondem aos valores de ano q mês que foram passados no parâmetro, adicionando a soma do salário total;
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		
		return sum;
		
	}
}

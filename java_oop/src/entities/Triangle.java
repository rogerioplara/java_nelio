package entities;
// nomeado como entities pois o triangulo é uma entidade do nosso negócio;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	// classe é a definição do tipo
	
	// método/funcao para calcular a área do triângulo
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	// cada classe é responsável por si mesma (coesão)
	
}



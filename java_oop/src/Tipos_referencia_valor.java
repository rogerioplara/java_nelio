
public class Tipos_referencia_valor {

	public static void main(String[] args) {

		/*
		 * Tipos referência vs. tipos valor
		 * 
		 * Classes são tipos referência
		 * 	- variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (ponteiros) para caixas;
		 * 
		 * Tipos referência aceitam valor "null", que indica que a variável aponta para ninguém;
		 * 
		 * Tipos primitivos são tipos valor
		 * 	- em java, tipos primitivos são CAIXAS e não ponteiros;
		 * 	- o valor de uma variável do tipo primitivo é copiado para outra variável quando é atribuída;
		 * 
		 * Valores padrão
		 * 	- quando alocamos (new) qualquer tipo estruturado (classe ou array) são atribuídos valores padrão aos seus elementos;
		 * 
		 * Classe (tipo referência):
		 * 	- vantagem: usufrui de todos recursos OO;
		 * 	- variáveis são ponteiros;
		 * 	- Objetos precisam ser instanciados usando new, ou apontar para um objeto já existente;
		 * 	- Aceita valor null
		 * 	- Y = X; -> y passa a apontar para onde x aponta;
		 * 	- objetos instanciados no heap
		 * 	- objetos não utilizados são desalocados em um momento próximo pelo garbage colector;
		 * 
		 * Tipo primitivo (tipo valor):
		 * 	- Vantagem: é mais simples e mais performático;
		 * 	- Variáveis são caixas
		 * 	- Não instancia. Uma vez declarados, estão prontos para uso;
		 * 	- Não aceita valor null
		 * 	- Y = X; -> y recebe uma cópia de x;
		 *  - "objetos" instanciados no stacl;
		 *  - "objetos" são desalocados imediatamente quando seu escopo de execução é finalizado;
		 *
		 */

	}

}

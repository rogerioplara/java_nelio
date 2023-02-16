import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // public static void main é o ponto de entrada da aplicação;
        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.printf("%.2f%n", x);
        // delimita a quantidade de casas decimais %.2f -> o %n é para pular linha;
        System.out.printf("%.4f%n", x);
        //o java pega o separador de decimais da língua em que o computador está. Para tirar essa configuração, é necessário importar a seguinte propriedade
        Locale.setDefault(Locale.US); // precisa importar a localização com "import java.util.Locale;" no início do código;
        System.out.printf("%.4f%n", x);
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$%.2f por mês%n", nome, idade, renda);

    }

}
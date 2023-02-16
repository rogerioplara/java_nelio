import java.util.Locale;
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // particularidade do java, necessário criar um objeto do tipo scanner
        Scanner sc = new Scanner(System.in);
        //precisa desalocar o scanner criado com sc.close();

        String x;
        x = sc.next(); // recebe o input e atribui à variável x;
        System.out.printf("Voce digitou: %s", x);

        int y;
        y = sc.nextInt(); //recebe o input INT e atribui à variável
        System.out.printf("Voce digitou: %d", y);

        double z;
        z = sc.nextDouble(); // pega o input com a vírgula, baseado na localidade do sistema;
        System.out.printf("Voce digitou: %.2f", z);

        double j;
        j = sc.nextDouble();
        System.out.printf("Voce digitou: %.2f", j);

        char i;
        i = sc.next().charAt(0); // maneira de ler um char, pega o primeiro caractere da string;
        System.out.printf("Voce digitou: %c", i);

        //Como ler vários dados na mesma linha

        String q;
        int w;
        double a;
        q = sc.next();
        w = sc.nextInt();
        a = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(q);
        System.out.println(w);
        System.out.println(a);


        sc.close(); //encerra o recurso do scanner
    }
}

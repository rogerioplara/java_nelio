import java.util.Locale;
import java.util.Scanner;

public class para_cada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
        }

        // foreach é utilizado para ler vetores
        System.out.println("Nomes lidos:");
        // apelido para cada elemento do vetor, no caso 'nome';
        for (String nome : nomes) {
            System.out.println(nome);
        }


        sc.close();
    }
}

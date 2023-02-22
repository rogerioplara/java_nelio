import java.util.Locale;
import java.util.Scanner;

public class vetor6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        String nomeVelho = null;
        int idadeVelho = 0;

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            if (idades[i] > idadeVelho){
                idadeVelho = idades[i];
                nomeVelho = nomes[i];
            }
        }

        System.out.printf("Pessoa mais velha: %s", nomeVelho);
        
        sc.close();
    }
}

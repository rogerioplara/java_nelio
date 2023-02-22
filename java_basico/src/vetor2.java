import java.util.Locale;
import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];
        int par = 0;

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0){
                System.out.print(numero + " ");
                par++;
            }
        }

        System.out.println();
        System.out.println(par);

        sc.close();
    }
}

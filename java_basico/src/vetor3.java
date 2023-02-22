import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros1 = new int[n];
        int[] numeros2 = new int[n];
        int[] soma = new int[n];

        for (int i = 0; i < n; i++) {
            numeros1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            numeros2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma[i] = numeros1[i] + numeros2[i];
        }

        for (int numero : soma) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}

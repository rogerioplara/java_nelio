import java.util.Locale;
import java.util.Scanner;
public class exercicio_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int soma = A + B;
        System.out.printf("SOMA = %d%n", soma);
        
        sc.close();
       
    }
}

import java.util.Scanner;

public class entrada_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //leitura feita após a quebra de linha, utilizar sc.nextLine();
        int x;
        String s1, s2, s3;
        x = sc.nextInt(); // nesse caso gera problema;
        //limpa o buffer de leitura;
        sc.nextLine(); // necessario fazer um sc.nextLine(); para consumir a quebra de linha anterior
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //quebra de linha pendente


        sc.close();
    }
}

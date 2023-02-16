public class casting {
    public static void main(String[] args) {

        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        int x2;
        double y2; //resultado será convertido para double, por padrão imprimirá .0 no final
        x2 = 5;
        y2 = 2 * x2;
        System.out.println(x2);
        System.out.println(y2);

        //utilizar o .0 quando o tipo for double;
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int a, c;
        double resultado;
        a = 5;
        c = 2;
        resultado = (double) a / c; //é possível avisar o compilador para não truncar as casas decimais (casting);
        System.out.println(resultado);

        double e;
        int f;
        e = 5.0;
        f = (int) e; //casting colocando o tipo entre parênteses;
        System.out.println(f);
    }
}

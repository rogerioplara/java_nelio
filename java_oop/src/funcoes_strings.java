
public class funcoes_strings {
    
	public static void main(String[] args) {
        /*
        funções mais utilizadas:
        Formatar: toLowerCase(), toUpperCase(), trim()
        Recortar: substring(inicio), substring(inicio, fim)
        Substituir: Replace(char, char), Replace(string, string)
        Buscar: IndexOf, LastIndexOF
        Comparar: equals()
        str.Split(" ")
        */

        String original = "abcde FGHIJ ABC abc DEFG    ";


        String s01 = original.toLowerCase(); // tudo minúsculo
        String s02 = original.toUpperCase(); // tudo maiúsculo
        String s03 = original.trim(); // elimina espaços nas extremidades
        String s04 = original.substring(2); // pega somente o caractere da posição 2 em diante começando com 0;
        String s05 = original.substring(2, 9); // pega somente os caracteres entre os índices 2, 9;
        String s06 = original.replace('a', 'x'); // troca o a minúsculo por x minúsculo
        String s07 = original.replace("abc", "xy"); // troca o a minúsculo por x minúsculo
        int i = original.indexOf("bc"); // pega a posição do substring "bc";
        int j = original.lastIndexOf("bc"); // pega a última ocorrência de "bc";

        // recorta a string onde tiver espaço e armazena dentro do vetor;
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        System.out.println();

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("index of 'bc: " + i);
        System.out.println("Last index of 'bc: " + j);

    }
}

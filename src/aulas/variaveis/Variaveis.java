package aulas.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        //Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA
        //exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".
        String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;

        //MÉTODO TRIM DE STRING
        String palavra = "    Média ";

        String palavraCorrigida = palavra.trim();
        System.out.println(palavraCorrigida);
    }
}

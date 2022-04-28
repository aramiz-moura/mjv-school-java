package repository;

import model.Pessoa;

import java.util.ArrayList;

public class Repository {

    private static ArrayList<Pessoa> cadastros = new ArrayList<>();

    public static void salvarCadastro(Pessoa pessoa) {
        cadastros.add(pessoa);
    }
    public static Pessoa getPessoa(int indice) {
        return cadastros.get(indice);
    }

}

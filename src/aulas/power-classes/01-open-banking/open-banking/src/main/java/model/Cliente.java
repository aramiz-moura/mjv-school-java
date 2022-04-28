package model;

import util.TipoPessoa;

public class Cliente {

    private String nome;
    private TipoPessoa tipoPessoa;
    private String cpfCnpj;
    private Movimentacao movimentacao;

    public Cliente(String nome, TipoPessoa tipoPessoa, String cpfCnpj, Movimentacao movimentacao) {
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.cpfCnpj = cpfCnpj;
        this.movimentacao = movimentacao;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


}

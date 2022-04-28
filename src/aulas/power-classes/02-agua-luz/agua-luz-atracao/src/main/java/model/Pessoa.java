package model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String celular;
    private Endereco endereco;
    private Protocolo protocolo;


    public Pessoa(String nome, String cpf, String rg, String celular, Endereco endereco, Protocolo protocolo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.celular = celular;
        this.endereco = endereco;
        this.protocolo = protocolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", celular='" + celular + '\'' +
                ", endereco=" + endereco +
                ", protocolo=" + protocolo +
                '}';
    }
}

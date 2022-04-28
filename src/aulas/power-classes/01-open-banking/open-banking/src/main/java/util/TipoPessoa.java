package util;

public enum TipoPessoa {
    PESSOA_FISICA("F"),
    PESSOA_JURIDICA("J");

    private String sigla;

    TipoPessoa(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return this.sigla;
    }
}

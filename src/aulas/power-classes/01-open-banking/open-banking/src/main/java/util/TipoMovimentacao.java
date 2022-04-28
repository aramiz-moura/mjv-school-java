package util;

public enum TipoMovimentacao {
    RECEITA("R"),
    DESPESA("D");

    private String sigla;

    TipoMovimentacao(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return this.sigla;
    }
}

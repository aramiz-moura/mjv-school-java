package util;

public enum TipoServico {

    AGUA("A", "R$ 123,00"),
    LUZ("L", "R$ 100,00");

    private String sigla;
    private String valor;

    TipoServico (String sigla, String valor) {
        this.sigla = sigla;
        this.valor = valor;
    }

    public String getSigla() {
        return sigla;
    }

    public String getValor() {
        return valor;
    }

}

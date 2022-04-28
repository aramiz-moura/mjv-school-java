package util;

public enum Localidade {
    BRASIL("BR"),
    NORUEGA("NO"),
    SUECIA("SE");

    private String sigla;

    Localidade(String sigla){
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

}

package util;

public enum TipoNotificacao {

    SMS("S"),
    WHATS("W");

    private String sigla;

    TipoNotificacao(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla(){
        return sigla;
    }
}

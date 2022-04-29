package com.mjv.agualuz.notification.model;

public enum TipoNotificacao {
    SMS("S"),
    WHATSAPP("W");

    TipoNotificacao(String sigla) {

    }
    private String sigla;

    public String getSigla(){
        return this.sigla;
    }
}

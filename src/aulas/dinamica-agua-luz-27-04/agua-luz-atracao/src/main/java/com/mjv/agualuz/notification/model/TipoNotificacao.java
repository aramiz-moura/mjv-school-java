package com.mjv.agualuz.notification.model;

public enum TipoNotificacao {
    SMS("S"),
    WHATSAPP("W");

    TipoNotificacao(String sigla) {

    }
    private String sigla;

    private String getSigla(){
        return this.sigla;
    }
}

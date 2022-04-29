package com.mjv.agualuz.notification.model;

public enum TipoNotificacao {
    SMS("S","Sms"),
    WHATSAPP("W","WhatsApp");

    TipoNotificacao(String sigla,String descricao) {

    }
    private String sigla;
    private String descricao;

    public String getSigla(){
        return this.sigla;
    }
    public String getDescricao() {
        return this.descricao;
    }
}

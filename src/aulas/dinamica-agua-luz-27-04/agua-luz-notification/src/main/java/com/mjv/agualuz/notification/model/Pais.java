package com.mjv.agualuz.notification.model;

public enum Pais {
    BRASIL("BR","Brasil"),
    ESTADOS_UNIDOS("EUA","Estados Unidos"),
    FRANCA("FR","França");

    private String sigla;
    private String descricao;

    Pais (String sigla,String descricao) {

    }

    public String getSigla() {
        return this.sigla;
    }
    public String getDescricao() {
        return this.descricao;
    }
}
package com.mjv.agualuz.notification.model;

public enum Pais {
	BRASIL("BR"),
	ESTADOS_UNIDOS("EUA"),
	FRANCA("FR");

	private String sigla;

	Pais (String sigla) {

	}

	public String getSigla() {
		return this.sigla;
	}
}

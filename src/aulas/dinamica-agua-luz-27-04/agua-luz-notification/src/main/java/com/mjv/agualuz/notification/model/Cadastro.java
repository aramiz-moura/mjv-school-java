package com.mjv.agualuz.notification.model;

public class Cadastro {
	private String nome;
	private String cpf;
	private String rg;
	private String celular;
	private Endereco endereco;
	private Pais pais;

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cadastro{" +
				"nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", rg='" + rg + '\'' +
				", celular='" + celular + '\'' +
				", endereco=" + endereco +
				", pais=" + pais +
				'}';
	}
}

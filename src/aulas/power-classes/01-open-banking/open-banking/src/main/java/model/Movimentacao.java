package model;

import util.TipoMovimentacao;

import java.time.LocalDate;

public class Movimentacao {
    private LocalDate dataMovimentacao;
    private TipoMovimentacao tipoMovimentacao;
    private Double valor;
    private Boolean estornada;

    public Movimentacao(LocalDate dataMovimentacao, TipoMovimentacao tipoMovimentacao, double valor, Boolean estornada) {
        this.dataMovimentacao = dataMovimentacao;
        this.tipoMovimentacao = tipoMovimentacao;
        this.valor = valor;
        this.estornada = estornada;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getEstornada() {
        return estornada;
    }

    public void setEstornada(Boolean estornada) {
        this.estornada = estornada;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
}

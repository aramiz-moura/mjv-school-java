package model;

import util.TipoNotificacao;
import util.TipoServico;

import java.time.LocalDate;
import java.time.LocalTime;



public class Protocolo {
    private Long numeroProtocolo;
    private LocalDate data;
    private LocalTime hora;
    private TipoServico tipoServico;
    private Double valor;
    private TipoNotificacao tipoNotificacao;


    public Protocolo(Long numeroProtocolo, LocalDate data, LocalTime hora, TipoServico tipoServico, Double valor, TipoNotificacao tipoNotificacao) {
        this.numeroProtocolo = numeroProtocolo;
        this.data = data;
        this.hora = hora;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.tipoNotificacao = tipoNotificacao;
    }

    public Long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(Long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoNotificacao getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    @Override
    public String toString() {
        return "Protocolo{" +
                "numeroProtocolo=" + numeroProtocolo +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoServico=" + tipoServico +
                ", valor=" + valor +
                ", tipoNotificacao=" + tipoNotificacao +
                '}';
    }
}

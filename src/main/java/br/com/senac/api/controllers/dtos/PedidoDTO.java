package br.com.senac.api.controllers.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PedidoDTO {
    private String nomeCliente;
    private String documentoCLiente;
    private LocalDateTime dataCriacao;
    private LocalDate dataEntrega;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDocumentoCLiente() {
        return documentoCLiente;
    }

    public void setDocumentoCLiente(String documentoCLiente) {
        this.documentoCLiente = documentoCLiente;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" +
                "nome='" + nomeCliente + '\'' +
                ", documento do cliente='" + documentoCLiente + '\'' +
                ", data de criação='" + dataCriacao + '\'' +
                ", data de Entrega='" + dataEntrega + '\'' +
                '}';
    }
}


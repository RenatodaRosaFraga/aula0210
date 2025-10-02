package br.com.senac.api.modelos;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nomeCliente;

    @Column (nullable = false)
    private String documentoCLiente;

    @Column (nullable = false)
    private LocalDateTime dataCriacao;

    @Column
    private LocalDate dataEntrega;

    @OneToMany(mappedBy = "pedido")
    private List<PedidosItens> pedidosItens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<PedidosItens> getPedidosItens() {
        return pedidosItens;
    }

    public void setPedidosItens(List<PedidosItens> pedidosItens) {
        this.pedidosItens = pedidosItens;
    }
}

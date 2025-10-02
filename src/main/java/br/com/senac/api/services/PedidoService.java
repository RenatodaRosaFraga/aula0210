package br.com.senac.api.services;

import br.com.senac.api.controllers.dtos.PedidoDTO;
import br.com.senac.api.modelos.Pedido;
import br.com.senac.api.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    public List<Pedido> listarTodos() {
        return pedidoRepositorio.findAll();
    }

    public Pedido criar(PedidoDTO pedido) {
        Pedido pedidoPersist = this.pedidoRequestDtoParaPedido(pedido);

        return pedidoRepositorio.save(pedidoPersist);
    }

    public Pedido atualizar(Long id, PedidoDTO pedido){
        if (!pedidoRepositorio.existsById(id)) {
            throw new RuntimeException("Pedido não encontrado!");
        }

        Pedido pedidoPersist = this.pedidoRequestDtoParaPedido(pedido);
        pedidoPersist.setId(id);

        return pedidoRepositorio.save(pedidoPersist);
    }

    public void excluir(Long id) {
        if (!pedidoRepositorio.existsById(id)) {
            throw new RuntimeException("Pedido não encontrado");
        }

        pedidoRepositorio.deleteById(id);

    }

    public Pedido listarById(Long id) {
        Optional <Pedido> pedidoResult = pedidoRepositorio.findById(id);
        if (pedidoResult.isEmpty()) {
            throw new RuntimeException("Pedido não encontrado");
        }

        return pedidoResult.get();
    }

    private Pedido pedidoRequestDtoParaPedido(PedidoDTO entrada) {
        Pedido saida = new Pedido();
        saida.setDataCriacao(LocalDateTime.now());
        saida.setDataEntrega(entrada.getDataEntrega());
        saida.setNomeCliente(entrada.getNomeCliente());
        saida.setDocumentoCLiente(entrada.getDocumentoCLiente());

        return saida;
    }

}

package br.com.senac.api.services;

import br.com.senac.api.controllers.dtos.PedidoDTO;
import br.com.senac.api.modelos.Pedido;
import br.com.senac.api.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

@Autowired
    private PedidoRepositorio pedidoRepositorio;


    public void criar(PedidoDTO pedido) {
    }

    public List<Pedido> listarTodos() {
    }
}

package br.com.senac.api.controllers;

import br.com.senac.api.controllers.dtos.PedidoDTO;
import br.com.senac.api.controllers.dtos.PedidosItensDTO;
import br.com.senac.api.modelos.Pedido;
import br.com.senac.api.services.ClientesService;
import br.com.senac.api.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping ("/criar")
    public ResponseEntity<Void> cadastrarPedido(@RequestBody PedidoDTO pedido) {
        System.out.println(pedido.toString());
        pedidoService.criar(pedido);
        return ResponseEntity.ok (null);

    }

    @GetMapping("/listar")
    public ResponseEntity<List<Pedido>> listarTodos() {return ResponseEntity.ok(pedidoService.listarTodos()); }
}

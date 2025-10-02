package br.com.senac.api.repositorios;

import br.com.senac.api.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository <Pedido, Long> {
}

package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Pedido;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
}

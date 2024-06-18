package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Factura;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long>{
    Factura findByPedidoId(Long pedidoId);
}

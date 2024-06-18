package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Pedido;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
    List<Pedido> findAllByClienteId(Long clienteId);
    List<Pedido> findAllByEmpleadoId(Long empleadoId);
    List<Pedido> findAllBySucursalId(Long sucursalId);
}

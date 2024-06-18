package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.ArticuloManufacturadoDetalle;

import java.util.List;

@Repository
public interface ArticuloManufacturadoDetalleRepository extends BaseRepository<ArticuloManufacturadoDetalle,Long> {
    List<ArticuloManufacturadoDetalle> findAllByArticuloInsumoId(Long articuloInsumoId);
    List<ArticuloManufacturadoDetalle> findAllByArticuloManufacturadoId(Long articuloManufacturadoId);

}

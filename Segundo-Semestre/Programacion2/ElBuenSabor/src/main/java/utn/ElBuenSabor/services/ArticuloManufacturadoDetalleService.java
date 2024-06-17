package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import utn.ElBuenSabor.repositories.ArticuloManufacturadoDetalleRepository;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long>{

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository) {
        super(articuloManufacturadoDetalleRepository);
    }
}

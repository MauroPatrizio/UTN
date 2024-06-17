package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.ArticuloManufacturado;
import utn.ElBuenSabor.repositories.ArticuloManufacturadoRepository;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long>{
    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }
}

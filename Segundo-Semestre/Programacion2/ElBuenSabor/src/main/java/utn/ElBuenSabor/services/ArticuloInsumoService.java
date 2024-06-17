package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.ArticuloInsumo;
import utn.ElBuenSabor.repositories.ArticuloInsumoRepository;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long>{
    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository) {
        super(articuloInsumoRepository);
    }
}

package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.UnidadMedida;
import utn.ElBuenSabor.repositories.UnidadMedidaRepository;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida, Long>{
    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository) {
        super(unidadMedidaRepository);
    }
}

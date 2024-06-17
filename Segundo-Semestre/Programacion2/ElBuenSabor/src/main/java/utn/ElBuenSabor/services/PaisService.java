package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Pais;
import utn.ElBuenSabor.repositories.PaisRepository;

@Service
public class PaisService extends BaseService<Pais, Long>{
    public PaisService(PaisRepository paisRepository) {
        super(paisRepository);
    }
}

package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Provincia;
import utn.ElBuenSabor.repositories.ProvinciaRepository;

@Service
public class ProvinciaService extends BaseService<Provincia, Long>{
    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        super(provinciaRepository);
    }
}

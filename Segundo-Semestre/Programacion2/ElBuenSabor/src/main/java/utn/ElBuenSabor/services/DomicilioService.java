package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Domicilio;
import utn.ElBuenSabor.repositories.DomicilioRepository;

@Service
public class DomicilioService extends BaseService<Domicilio, Long>{
    public DomicilioService(DomicilioRepository domicilioRepository) {
        super(domicilioRepository);
    }
}

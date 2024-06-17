package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Localidad;
import utn.ElBuenSabor.repositories.LocalidadRepository;

@Service
public class LocalidadService extends BaseService<Localidad, Long>{
    public LocalidadService(LocalidadRepository localidadRepository) {
        super(localidadRepository);
    }
}

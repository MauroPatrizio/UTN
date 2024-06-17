package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Promocion;
import utn.ElBuenSabor.repositories.PromocionRepository;

@Service
public class PromocionService extends BaseService<Promocion, Long> {
    public PromocionService(PromocionRepository promocionRepository) {
        super(promocionRepository);
    }
}

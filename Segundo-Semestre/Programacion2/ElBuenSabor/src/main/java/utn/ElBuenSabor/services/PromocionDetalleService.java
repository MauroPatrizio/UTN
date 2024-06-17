package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.PromocionDetalle;
import utn.ElBuenSabor.repositories.PromocionDetalleRepository;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long>{
    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository) {
        super(promocionDetalleRepository);
    }
}

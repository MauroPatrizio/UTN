package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Factura;
import utn.ElBuenSabor.repositories.FacturaRepository;

@Service
public class FacturaService extends BaseService<Factura, Long> {
    public FacturaService(FacturaRepository facturaRepository) {
        super(facturaRepository);
    }
}

package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Sucursal;
import utn.ElBuenSabor.repositories.SucursalRepository;

@Service
public class SucursalService extends BaseService<Sucursal, Long>{
    public SucursalService(SucursalRepository sucursalRepository) {
        super(sucursalRepository);
    }
}

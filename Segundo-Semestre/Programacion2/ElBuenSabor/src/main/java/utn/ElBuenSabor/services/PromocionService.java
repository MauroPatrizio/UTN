package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Promocion;
import utn.ElBuenSabor.entities.Sucursal;
import utn.ElBuenSabor.repositories.PromocionRepository;

import java.util.List;

@Service
public class PromocionService extends BaseService<Promocion, Long> {
    public PromocionService(PromocionRepository promocionRepository) {
        super(promocionRepository);
    }

    @Autowired
    private PromocionRepository promocionRepository;

    @Transactional
    public List<Promocion> listarPorSucursal(Long sucursalId) throws Exception {
        try {
            return promocionRepository.findAllBySucursalId(sucursalId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

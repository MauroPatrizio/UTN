package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Sucursal;
import utn.ElBuenSabor.repositories.SucursalRepository;

import java.util.List;

@Service
public class SucursalService extends BaseService<Sucursal, Long>{
    public SucursalService(SucursalRepository sucursalRepository) {
        super(sucursalRepository);
    }

    @Autowired
    private SucursalRepository sucursalRepository;

    @Transactional
    public List<Sucursal> listarPorEmpresaId(Long empresaId) throws Exception{
        try {
            return sucursalRepository.findAllByEmpresaId(empresaId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

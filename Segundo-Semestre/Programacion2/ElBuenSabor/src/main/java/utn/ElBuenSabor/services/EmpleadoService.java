package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Empleado;
import utn.ElBuenSabor.repositories.EmpleadoRepository;

import java.util.List;

@Service
public class EmpleadoService extends BaseService<Empleado, Long>{
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
    }

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Transactional
    public List<Empleado> listarPorSucursal(Long sucursalId) throws Exception{
        try {
            return empleadoRepository.findAllBySucursalId(sucursalId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

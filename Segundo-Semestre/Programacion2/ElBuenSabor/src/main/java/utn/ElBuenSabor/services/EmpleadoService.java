package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Empleado;
import utn.ElBuenSabor.repositories.EmpleadoRepository;

@Service
public class EmpleadoService extends BaseService<Empleado, Long>{
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
    }
}

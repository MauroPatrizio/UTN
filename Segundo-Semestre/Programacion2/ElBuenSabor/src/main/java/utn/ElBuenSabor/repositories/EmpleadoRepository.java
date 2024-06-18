package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Empleado;

import java.util.List;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {

    List<Empleado> findAllBySucursalId(Long sucursalId);
}

package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Empleado;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {
}

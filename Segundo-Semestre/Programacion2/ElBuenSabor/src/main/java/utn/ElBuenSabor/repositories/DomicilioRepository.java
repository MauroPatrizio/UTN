package utn.ElBuenSabor.repositories;


import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Domicilio;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {
    List<Domicilio> findAllByLocalidadId(Long localidadId);
    List<Domicilio> findAllByClientesId(Long clienteId);
}

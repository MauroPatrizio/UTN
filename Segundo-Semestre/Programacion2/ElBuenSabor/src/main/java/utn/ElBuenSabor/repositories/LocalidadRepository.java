package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Localidad;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {
    List<Localidad> findAllByProvinciaId(Long provinciaId);
}

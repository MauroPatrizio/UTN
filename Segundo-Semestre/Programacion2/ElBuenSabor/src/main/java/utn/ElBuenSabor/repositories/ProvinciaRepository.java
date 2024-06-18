package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Provincia;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia, Long>{
    List<Provincia> findAllByPaisId(Long idPais);
}

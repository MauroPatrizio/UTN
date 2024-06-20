package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Articulo;

import java.util.List;

@Repository
public interface ArticuloRepository extends BaseRepository<Articulo, Long>{
    List<Articulo> findAllByCategoriaId(Long categoriaId);
}

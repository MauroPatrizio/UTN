package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Categoria;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long>{
    List<Categoria> findAllByCategoriaPadre_Id(Long idCategoriaPadre);
    List<Categoria> findAllBySucursalesId(Long sucursalId);
}

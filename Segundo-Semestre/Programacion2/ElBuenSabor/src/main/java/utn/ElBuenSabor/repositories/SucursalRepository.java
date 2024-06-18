package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Sucursal;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal, Long>{
    List<Sucursal> findAllByEmpresaId(Long empresaId);
}

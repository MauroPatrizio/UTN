package utn.ElBuenSabor.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Promocion;

import java.util.List;

@Repository
public interface PromocionRepository extends BaseRepository<Promocion, Long>{

    @Query("SELECT p FROM Promocion p JOIN p.sucursales s WHERE s.id = :sucursalId")
    List<Promocion> findAllBySucursalId(Long sucursalId);
}

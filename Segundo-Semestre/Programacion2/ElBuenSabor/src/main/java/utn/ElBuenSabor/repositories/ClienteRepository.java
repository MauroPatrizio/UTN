package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Cliente;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{
}

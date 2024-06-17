package utn.ElBuenSabor.repositories;

import org.springframework.stereotype.Repository;
import utn.ElBuenSabor.entities.Usuario;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long>{
}

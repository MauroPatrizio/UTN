package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Usuario;
import utn.ElBuenSabor.repositories.UsuarioRepository;

@Service
public class UsuarioService extends BaseService<Usuario, Long>{
    public UsuarioService(UsuarioRepository usuarioRepository) {
        super(usuarioRepository);
    }
}

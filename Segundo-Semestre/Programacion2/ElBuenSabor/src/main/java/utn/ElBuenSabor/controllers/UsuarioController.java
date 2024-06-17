package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Usuario;
import utn.ElBuenSabor.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, Long>{
    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
    }
}

package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Pais;
import utn.ElBuenSabor.services.PaisService;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseController<Pais, Long>{
    public PaisController(PaisService paisService) {
        super(paisService);
    }
}

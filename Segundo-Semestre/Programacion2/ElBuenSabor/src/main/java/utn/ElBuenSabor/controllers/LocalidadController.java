package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Localidad;
import utn.ElBuenSabor.services.LocalidadService;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long>{
    public LocalidadController(LocalidadService localidadService) {
        super(localidadService);
    }
}

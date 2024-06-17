package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Provincia;
import utn.ElBuenSabor.services.ProvinciaService;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long>{
    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }
}

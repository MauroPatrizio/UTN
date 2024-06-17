package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Domicilio;
import utn.ElBuenSabor.services.DomicilioService;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long>{
    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }
}

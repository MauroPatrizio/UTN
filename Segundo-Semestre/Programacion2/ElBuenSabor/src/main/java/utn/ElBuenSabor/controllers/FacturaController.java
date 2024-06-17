package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.services.FacturaService;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseController{
    public FacturaController(FacturaService facturaService){
        super(facturaService);
    }
}

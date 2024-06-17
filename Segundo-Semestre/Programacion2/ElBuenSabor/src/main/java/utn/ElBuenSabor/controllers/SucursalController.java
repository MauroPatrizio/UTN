package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Sucursal;
import utn.ElBuenSabor.services.SucursalService;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long>{
    public SucursalController(SucursalService sucursalService) {
        super(sucursalService);
    }
}

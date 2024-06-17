package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Promocion;
import utn.ElBuenSabor.services.PromocionService;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseController<Promocion, Long>{
    public PromocionController(PromocionService promocionService) {
        super(promocionService);
    }
}

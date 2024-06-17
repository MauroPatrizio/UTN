package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.PromocionDetalle;
import utn.ElBuenSabor.services.PromocionDetalleService;

@RestController
@RequestMapping("/promocion-detalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long>{
    public PromocionDetalleController(PromocionDetalleService promocionDetalleService) {
        super(promocionDetalleService);
    }
}

package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.UnidadMedida;
import utn.ElBuenSabor.services.UnidadMedidaService;

@RestController
@RequestMapping("/unidad-medida")
public class UnidadMedidaController extends BaseController<UnidadMedida, Long>{
    public UnidadMedidaController(UnidadMedidaService unidadMedidaService) {
        super(unidadMedidaService);
    }
}

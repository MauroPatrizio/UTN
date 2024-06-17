package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.ArticuloInsumo;
import utn.ElBuenSabor.services.ArticuloInsumoService;

@RestController
@RequestMapping("/articulo-insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long>{
    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService) {
        super(articuloInsumoService);
    }
}

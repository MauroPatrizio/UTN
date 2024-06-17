package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.ArticuloManufacturado;
import utn.ElBuenSabor.services.ArticuloManufacturadoService;

@RestController
@RequestMapping("/articulo-manufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado, Long>{
    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService) {
        super(articuloManufacturadoService);
    }
}

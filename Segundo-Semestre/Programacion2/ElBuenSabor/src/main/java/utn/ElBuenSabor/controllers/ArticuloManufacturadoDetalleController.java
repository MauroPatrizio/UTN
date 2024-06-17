package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.ArticuloManufacturado;
import utn.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import utn.ElBuenSabor.services.ArticuloManufacturadoDetalleService;

@RestController
@RequestMapping("/articulo-manufacturado-detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long>{
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService) {
        super(articuloManufacturadoDetalleService);
    }
}

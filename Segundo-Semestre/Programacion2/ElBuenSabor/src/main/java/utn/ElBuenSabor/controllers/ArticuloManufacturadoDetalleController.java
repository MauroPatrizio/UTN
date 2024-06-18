package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import utn.ElBuenSabor.services.ArticuloManufacturadoDetalleService;

import java.util.List;

@RestController
@RequestMapping("/articulo_manufacturado_detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long>{
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService) {
        super(articuloManufacturadoDetalleService);
    }


    @Autowired
    private ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;

    @GetMapping("/articulo_insumo/{articuloInsumoId}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarPorArticuloInsumo(@PathVariable Long articuloInsumoId) throws Exception{
        List<ArticuloManufacturadoDetalle> detalles =  articuloManufacturadoDetalleService.listarPorArticuloInsumo(articuloInsumoId);
        return ResponseEntity.ok(detalles);
    }

    @GetMapping("/articulo_manufacturado/{articuloManufacturadoId}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarPorArticuloManufacturado(@PathVariable Long articuloManufacturadoId) throws Exception{
        List<ArticuloManufacturadoDetalle> detalles =  articuloManufacturadoDetalleService.listarPorArticuloManufacturadoId(articuloManufacturadoId);
        return ResponseEntity.ok(detalles);
    }
}

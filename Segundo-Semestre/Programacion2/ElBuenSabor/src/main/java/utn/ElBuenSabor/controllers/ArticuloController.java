package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Articulo;
import utn.ElBuenSabor.services.ArticuloService;

import java.util.List;

@RestController
@RequestMapping("/articulos")
public class ArticuloController extends BaseController<Articulo, Long>{
    public ArticuloController(ArticuloService articuloService) {
        super(articuloService);
    }

    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/categoria/{categoriaId}")
    public ResponseEntity<List<Articulo>> listarPorCategoria(@PathVariable Long categoriaId) throws Exception {
        List<Articulo> articulos = articuloService.listarPorCategoria(categoriaId);
        return ResponseEntity.ok(articulos);
    }
}

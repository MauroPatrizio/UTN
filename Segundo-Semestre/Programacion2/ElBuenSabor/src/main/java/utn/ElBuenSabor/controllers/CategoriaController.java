package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.ElBuenSabor.entities.Categoria;
import utn.ElBuenSabor.services.CategoriaService;
import utn.ElBuenSabor.services.SucursalService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseController<Categoria, Long>{
    public CategoriaController(CategoriaService categoriaService) {
        super(categoriaService);
    }

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/subcategoria/{id_CP}")
    public Optional<Categoria> agregarSubCategoria(@PathVariable Long id_CP, @RequestBody Categoria subCategoria) throws Exception{
        Categoria catPadre = categoriaService.agregarSubcategoria(id_CP, subCategoria);
        return Optional.ofNullable(catPadre);
    }

    @GetMapping("/categoriaPadre/{id}")
    public ResponseEntity<List<Categoria>> listarPorCategoriaPadre(@PathVariable Long id) throws Exception{
        List<Categoria> categorias = categoriaService.listarPorCategoriaPadre(id);
        return ResponseEntity.ok(categorias);
    }
    @GetMapping("/sucursal/{sucursalId}")
    public ResponseEntity<List<Categoria>> listarPorSucursal(@PathVariable Long sucursalId) throws Exception{
        List<Categoria> categorias = categoriaService.listarPorCategoriaPadre(sucursalId);
        return ResponseEntity.ok(categorias);
    }

}

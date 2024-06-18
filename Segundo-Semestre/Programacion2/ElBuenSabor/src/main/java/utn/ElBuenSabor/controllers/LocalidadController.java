package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Localidad;
import utn.ElBuenSabor.services.LocalidadService;

import java.util.List;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long>{
    public LocalidadController(LocalidadService localidadService) {
        super(localidadService);
    }

    @Autowired
    private LocalidadService localidadService;

    @GetMapping("/provincia/{idProvincia}")
    public ResponseEntity<List<Localidad>> listarPorProvincia(@PathVariable Long idProvincia) throws Exception{
        List<Localidad> localidades = localidadService.listarPorProvincia(idProvincia);
        return ResponseEntity.ok(localidades);
    }
}

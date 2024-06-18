package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Provincia;
import utn.ElBuenSabor.services.ProvinciaService;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long>{

    @Autowired
    private ProvinciaService provinciaService;

    @GetMapping("/pais/{idPais}")
    public ResponseEntity<List<Provincia>> getProvincia(@PathVariable Long idPais) throws Exception{
        List<Provincia> provincias = provinciaService.listarPorPais(idPais);
        return ResponseEntity.ok(provincias);
    }

    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }
}

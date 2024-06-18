package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Domicilio;
import utn.ElBuenSabor.services.DomicilioService;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long>{
    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

    @Autowired
    private DomicilioService domicilioService;

    @GetMapping("/localidad/{idLocalidad}")
    public ResponseEntity<List<Domicilio>> listarPorLocalidad(@PathVariable Long idLocalidad) throws Exception{
        List<Domicilio> domicilios = domicilioService.listarPorLocalidad(idLocalidad);
        return ResponseEntity.ok(domicilios);
    }

    @GetMapping("/localidad/{clienteId}")
    public ResponseEntity<List<Domicilio>> listarPorCliente(@PathVariable Long clienteId) throws Exception{
        List<Domicilio> domicilios = domicilioService.listarPorCliente(clienteId);
        return ResponseEntity.ok(domicilios);
    }
}

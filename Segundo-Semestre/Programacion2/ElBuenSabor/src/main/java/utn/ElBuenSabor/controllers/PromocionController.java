package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Promocion;
import utn.ElBuenSabor.services.PromocionService;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseController<Promocion, Long>{
    public PromocionController(PromocionService promocionService) {
        super(promocionService);
    }

    @Autowired
    private PromocionService promocionService;

    @GetMapping("/sucursal/{sucursalId}")
    public ResponseEntity<List<Promocion>> listarPorSucursal(@PathVariable Long sucursalId) throws Exception{
        List<Promocion> promociones = promocionService.listarPorSucursal(sucursalId);
        if(promociones.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(promociones);
        }
    }
}

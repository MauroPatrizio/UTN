package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Categoria;
import utn.ElBuenSabor.entities.Sucursal;
import utn.ElBuenSabor.services.SucursalService;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long>{
    public SucursalController(SucursalService sucursalService) {
        super(sucursalService);
    }

    @Autowired
    private SucursalService sucursalService;

    @GetMapping("/empresa/{empresaId}")
    public ResponseEntity<List<Sucursal>>  listarPorEmpresa(@PathVariable Long empresaId) throws Exception{
        List<Sucursal> sucursales  =  sucursalService.listarPorEmpresaId(empresaId);
        if(sucursales.isEmpty()){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(sucursales);
        }
    }
}

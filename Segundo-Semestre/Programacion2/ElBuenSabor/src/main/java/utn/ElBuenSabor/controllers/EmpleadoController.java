package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Empleado;
import utn.ElBuenSabor.services.DomicilioService;
import utn.ElBuenSabor.services.EmpleadoService;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long>{
    public EmpleadoController(EmpleadoService empleadoService) {
        super(empleadoService);
    }

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/sucursal/{sucursalId}")
    public ResponseEntity<List<Empleado>>  listarPorSucursal(@PathVariable Long sucursalId) throws Exception{
        List<Empleado> empleados = empleadoService.listarPorSucursal(sucursalId);
        return ResponseEntity.ok(empleados);
    }
}

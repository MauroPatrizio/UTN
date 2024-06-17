package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Empleado;
import utn.ElBuenSabor.services.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long>{
    public EmpleadoController(EmpleadoService empleadoService) {
        super(empleadoService);
    }
}

package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Empresa;
import utn.ElBuenSabor.services.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseController<Empresa, Long>{
    public EmpresaController(EmpresaService empresaService) {
        super(empresaService);
    }
}

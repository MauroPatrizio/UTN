package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Cliente;
import utn.ElBuenSabor.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long>{
    public ClienteController(ClienteService clienteService) {
        super(clienteService);
    }
}

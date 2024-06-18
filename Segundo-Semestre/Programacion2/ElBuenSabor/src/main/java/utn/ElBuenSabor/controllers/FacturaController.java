package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Factura;
import utn.ElBuenSabor.services.FacturaService;

import java.util.Optional;

@RestController
@RequestMapping("/factura")
public class FacturaController extends BaseController{
    public FacturaController(FacturaService facturaService){
        super(facturaService);
    }

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/pedido/{pedidoId}")
    public Optional<Factura> buscarPorPedidoId(@PathVariable Long pedidoId) throws Exception{
        Factura factura = facturaService.buscarPorPedido(pedidoId);
        return Optional.ofNullable(factura);
    }
}

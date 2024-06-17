package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.DetallePedido;
import utn.ElBuenSabor.services.DetallePedidoService;

import java.util.List;

@RestController
@RequestMapping("/detalle_pedidos")
public class DetallePedidoController extends BaseController<DetallePedido, Long>{
    @Autowired
    private DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService) {
        super(detallePedidoService);
    }

    @GetMapping("/pedido/{id}")
    public ResponseEntity<List<DetallePedido>> listarPorPedido(@PathVariable Long pedidoId) throws Exception{
        List<DetallePedido> detallePedido = detallePedidoService.listarPorPedido(pedidoId);
        return ResponseEntity.ok(detallePedido);
    }

}

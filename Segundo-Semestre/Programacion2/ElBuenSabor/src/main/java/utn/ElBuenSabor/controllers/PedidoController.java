package utn.ElBuenSabor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.ElBuenSabor.entities.Pedido;
import utn.ElBuenSabor.services.PedidoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long>{

    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception{
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);

    }

    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<Pedido>> listarPorClienteId(@PathVariable Long clienteId)throws Exception{
        List<Pedido> pedidos = pedidoService.listarPorClienteId(clienteId);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/empleado/{empleadoId}")
    public ResponseEntity<List<Pedido>> listarPorEmpleadoId(@PathVariable Long empleadoId)throws Exception{
        List<Pedido> pedidos = pedidoService.listarPorEmpleadoId(empleadoId);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/sucursal/{sucursalId}")
    public ResponseEntity<List<Pedido>> listarPorSucursalId(@PathVariable Long sucursalId)throws Exception{
        List<Pedido> pedidos = pedidoService.listarPorSucursalId(sucursalId);
        return ResponseEntity.ok(pedidos);
    }
}

package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.DetallePedido;
import utn.ElBuenSabor.entities.Pedido;
import utn.ElBuenSabor.repositories.PedidoRepository;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long>{

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;

    public PedidoService(PedidoRepository pedidoRepository) {
        super(pedidoRepository);
    }

    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception {
        try {
            //Lista de detalles del pedido dado
            List<DetallePedido> detallePedidos = detallePedidoService.listarPorPedido(pedido.getId());
            Double total = 0.0;

            //Se suman los subtotales si la lista no es nula ni vacía
            if (detallePedidos != null && !detallePedidos.isEmpty()) {
                total = detallePedidos.stream()
                        .mapToDouble(detalle -> detalle.getSubTotal())
                        .sum();
            }

            //Establece el total en el pedido
            pedido.setTotal(total);

            //Guarda y retorna el pedido
            return (Pedido) pedidoRepository.save(pedido);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try {
            calcularTotal(pedido);
            return (Pedido) pedidoRepository.save(pedido);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPorClienteId(Long clienteId) throws Exception{
        try {
            return pedidoRepository.findAllByClienteId(clienteId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPorEmpleadoId(Long empleadoId) throws Exception{
        try {
            return pedidoRepository.findAllByEmpleadoId(empleadoId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Pedido> listarPorSucursalId(Long sucursalId) throws Exception{
        try {
            return pedidoRepository.findAllBySucursalId(sucursalId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}


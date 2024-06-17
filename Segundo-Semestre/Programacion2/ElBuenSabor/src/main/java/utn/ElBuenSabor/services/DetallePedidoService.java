package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.DetallePedido;
import utn.ElBuenSabor.repositories.DetallePedidoRepository;

import java.util.List;

@Service
public class DetallePedidoService extends BaseService<DetallePedido, Long>{
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        super(detallePedidoRepository);
    }

    @Transactional
    public List<DetallePedido> listarPorPedido(Long pedidoId) throws Exception{
        try {
            return detallePedidoRepository.findAllByPedidoId(pedidoId);
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}

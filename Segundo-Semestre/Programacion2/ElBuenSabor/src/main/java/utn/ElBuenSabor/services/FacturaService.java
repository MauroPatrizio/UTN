package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Factura;
import utn.ElBuenSabor.repositories.FacturaRepository;

@Service
public class FacturaService extends BaseService<Factura, Long> {
    public FacturaService(FacturaRepository facturaRepository) {
        super(facturaRepository);
    }

    @Autowired
    private FacturaRepository facturaRepository;

    @Transactional
    public Factura buscarPorPedido(Long pedidoId) throws Exception {
        try {
            return facturaRepository.findByPedidoId(pedidoId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

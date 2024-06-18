package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import utn.ElBuenSabor.repositories.ArticuloManufacturadoDetalleRepository;

import java.util.List;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long>{

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository) {
        super(articuloManufacturadoDetalleRepository);
    }

    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarPorArticuloInsumo(Long articuloInsumoId) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.findAllByArticuloInsumoId(articuloInsumoId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarPorArticuloManufacturadoId(Long articuloManufacturadoId) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.findAllByArticuloManufacturadoId(articuloManufacturadoId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

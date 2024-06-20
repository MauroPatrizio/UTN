package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Articulo;
import utn.ElBuenSabor.repositories.ArticuloRepository;

import java.util.List;

@Service
public class ArticuloService extends BaseService<Articulo, Long>{

    public ArticuloService(ArticuloRepository articuloRepository) {
        super(articuloRepository);
    }

    @Autowired
    private ArticuloRepository articuloRepository;

    @Transactional
    public List<Articulo> listarPorCategoria(Long idCategoria) throws Exception{
        try {
            return articuloRepository.findAllByCategoriaId(idCategoria);
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

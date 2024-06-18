package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Provincia;
import utn.ElBuenSabor.repositories.ProvinciaRepository;

import java.util.List;

@Service
public class ProvinciaService extends BaseService<Provincia, Long>{

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        super(provinciaRepository);
    }
    @Transactional
    public List<Provincia> listarPorPais(Long idPais) throws Exception {
        try {
            return provinciaRepository.findAllByPaisId(idPais);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

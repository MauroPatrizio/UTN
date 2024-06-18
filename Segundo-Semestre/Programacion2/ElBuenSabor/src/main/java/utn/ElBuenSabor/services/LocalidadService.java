package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Localidad;
import utn.ElBuenSabor.repositories.LocalidadRepository;

import java.util.List;

@Service
public class LocalidadService extends BaseService<Localidad, Long>{
    public LocalidadService(LocalidadRepository localidadRepository) {
        super(localidadRepository);
    }

    @Autowired
    private LocalidadRepository localidadRepository;

    @Transactional
    public List<Localidad> listarPorProvincia(Long localidadId) throws Exception{
        try {
            return localidadRepository.findAllByProvinciaId(localidadId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

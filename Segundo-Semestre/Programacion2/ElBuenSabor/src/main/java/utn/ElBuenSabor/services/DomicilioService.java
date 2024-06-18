package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Domicilio;
import utn.ElBuenSabor.repositories.DomicilioRepository;

import java.util.List;

@Service
public class DomicilioService extends BaseService<Domicilio, Long>{
    public DomicilioService(DomicilioRepository domicilioRepository) {
        super(domicilioRepository);
    }

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Transactional
    public List<Domicilio> listarPorLocalidad(Long localidadId) throws Exception{
        try {
            return domicilioRepository.findAllByLocalidadId(localidadId);
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
@Transactional
    public List<Domicilio> listarPorCliente(Long clienteId) throws Exception{
        try {
            return domicilioRepository.findAllByClientesId(clienteId);
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}

package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Cliente;
import utn.ElBuenSabor.repositories.ClienteRepository;

@Service
public class ClienteService extends BaseService<Cliente, Long>{
    public ClienteService(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }
}

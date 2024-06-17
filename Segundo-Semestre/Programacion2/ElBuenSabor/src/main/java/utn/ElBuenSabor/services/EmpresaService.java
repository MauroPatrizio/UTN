package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Empresa;
import utn.ElBuenSabor.repositories.EmpresaRepository;

@Service
public class EmpresaService extends BaseService<Empresa, Long>{

    public EmpresaService(EmpresaRepository empresaRepository) {
        super(empresaRepository);}
}

package utn.FinalJunit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.FinalJunit.entities.Empresa;
import utn.FinalJunit.Repositories.EmpresaRepository;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa guardarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Empresa obtenerEmpresaPorId(Long id) {
        return empresaRepository.findById(id).orElse(null);
    }

    public List<Empresa> obtenerTodasLasEmpresas() {
        return empresaRepository.findAll();
    }

    public void eliminarEmpresaPorId(Long id) {
        empresaRepository.deleteById(id);
    }

    public List<Empresa> encontrarEmpresasPorNombre(String nombre) {
        return empresaRepository.findByNombre(nombre);
    }

    public long contarEmpresas(){
        return empresaRepository.count();
    }
}

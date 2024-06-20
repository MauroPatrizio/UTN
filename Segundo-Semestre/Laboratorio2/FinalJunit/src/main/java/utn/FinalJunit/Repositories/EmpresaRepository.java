package utn.FinalJunit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.FinalJunit.entities.Empresa;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    List<Empresa> findByNombre(String nombre);
}

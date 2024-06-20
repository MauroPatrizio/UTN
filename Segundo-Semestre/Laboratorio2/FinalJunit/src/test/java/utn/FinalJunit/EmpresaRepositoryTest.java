package utn.FinalJunit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import utn.FinalJunit.entities.Empresa;
import utn.FinalJunit.Repositories.EmpresaRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class EmpresaRepositoryTest {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa crearEmpresa(){
        Empresa empresa = new Empresa("Mercado Libre", "Mercado Libre S.A.", 123456789);
        return empresaRepository.save(empresa);
    }

    @Test
    public void testGuardarYrecuperarEmpresa(){
        Empresa empresa = crearEmpresa();
        Empresa empresaGuardada = empresaRepository.save(empresa);
        assertThat(empresaGuardada.getId()).isNotNull();

        Empresa empresaRecuperada = empresaRepository.findById(empresaGuardada.getId()).orElse(null);
        assertThat(empresaRecuperada).isNotNull();
        assertThat(empresaRecuperada.getNombre()).isEqualTo("Mercado Libre");
        assertThat(empresaRecuperada.getRazonSocial()).isEqualTo("Mercado Libre S.A.");
        assertThat(empresaRecuperada.getCuil()).isEqualTo(123456789);
    }

    @Test
    public void testEncontrarTodasLasEmpresas(){
        Empresa empresa1 = crearEmpresa();
        Empresa empresa2 = new Empresa("Globant", "Globant S.A.", 987654321);
        empresaRepository.save(empresa1);
        empresaRepository.save(empresa2);

        List<Empresa> empresas = empresaRepository.findAll();
        assertThat(empresas).hasSize(2);
        assertThat(empresas).extracting(Empresa::getNombre).contains("Mercado Libre", "Globant");
    }

    @Test
    public void testActualizarEmpresa(){
        Empresa empresa = crearEmpresa();
        Empresa empresaGuardada = empresaRepository.save(empresa);

        empresaGuardada.setNombre("NombreActualizado");
        empresaGuardada.setRazonSocial("razonsocialActualizada");
        empresaGuardada.setCuil(88888888);
        Empresa empresaActualizada = empresaRepository.save(empresaGuardada);

        assertThat(empresaActualizada.getNombre()).isEqualTo("NombreActualizado");
        assertThat(empresaActualizada.getRazonSocial()).isEqualTo("razonsocialActualizada");
        assertThat(empresaActualizada.getCuil()).isEqualTo(88888888);
    }

    @Test
    public void testEliminarEmpresa(){
        Empresa empresa = crearEmpresa();
        Empresa empresaGuardada = empresaRepository.save(empresa);

        empresaRepository.deleteById(empresa.getId());
        Empresa empresaEliminada = empresaRepository.findById(empresaGuardada.getId()).orElse(null);
        assertThat(empresaEliminada).isNull();
    }

    @Test
    public void testEncontrarEmpresasPorNombre(){
        Empresa empresa = crearEmpresa();
        Empresa empresa2 = new Empresa("Globant", "Globant S.A", 123456789);
        empresaRepository.save(empresa);
        empresaRepository.save(empresa2);

        List<Empresa> empresas = empresaRepository.findByNombre("Globant");
        assertThat(empresas).hasSize(1);
        assertThat(empresas).extracting(Empresa::getCuil).contains(123456789);
    }

    @Test
    public void testContarEmpresas(){
        Empresa empresa = crearEmpresa();
        Empresa empresa2 = new Empresa("Globant", "Globant S.A", 123456789);
        empresaRepository.save(empresa);
        empresaRepository.save(empresa2);

        long contador = empresaRepository.count();
        assertThat(contador).isEqualTo(2);
    }
}


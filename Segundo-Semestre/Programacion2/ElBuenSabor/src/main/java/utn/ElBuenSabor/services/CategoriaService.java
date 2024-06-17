package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Categoria;
import utn.ElBuenSabor.repositories.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService extends BaseService<Categoria, Long>{
    public CategoriaService(CategoriaRepository categoriaRepository) {
        super(categoriaRepository);
    }

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public Categoria agregarSubcategoria(Long idCategoriaPadre, Categoria nuevaSubcategoria) throws Exception{
        try {
            Categoria categoriaPadre = categoriaRepository.findById(idCategoriaPadre).orElse(null);
            if (categoriaPadre != null) {
                nuevaSubcategoria.setCategoriaPadre(categoriaPadre);
                categoriaRepository.save(nuevaSubcategoria);
                return nuevaSubcategoria;
            } else {
                return null;
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Categoria> listarPorCategoriaPadre(Long idCategoriaPadre) throws Exception{
        try {
            return categoriaRepository.findAllByCategoriaPadre_Id(idCategoriaPadre);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

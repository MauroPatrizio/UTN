package utn.ElBuenSabor.services;

import jakarta.transaction.Transactional;
import utn.ElBuenSabor.entities.Base;
import utn.ElBuenSabor.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<E extends Base, ID extends Serializable> {

    protected BaseRepository<E, ID> baseRepository;

    protected BaseService(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Transactional
    public List<E> listar() throws Exception{
        try {
            return baseRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Optional<E> buscarPorId(ID id) throws Exception{
        try {
            return Optional.ofNullable((E) baseRepository.findById(id).orElse(null));
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E actualizar(E entity) throws Exception{
        try {
            return (E) baseRepository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E crear(E entity) throws Exception{
        try {
            return (E) baseRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public void eliminar(ID id) throws Exception{
        try {
            baseRepository.deleteById(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

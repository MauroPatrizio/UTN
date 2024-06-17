package utn.ElBuenSabor.services;

import org.springframework.stereotype.Service;
import utn.ElBuenSabor.entities.Imagen;
import utn.ElBuenSabor.repositories.ImagenRepository;

@Service
public class ImagenService extends BaseService<Imagen, Long>{
    public ImagenService(ImagenRepository imagenRepository) {
        super(imagenRepository);
    }
}

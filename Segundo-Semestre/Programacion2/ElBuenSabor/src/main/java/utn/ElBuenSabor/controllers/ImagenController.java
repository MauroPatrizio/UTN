package utn.ElBuenSabor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Imagen;
import utn.ElBuenSabor.services.ImagenService;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseController<Imagen, Long>{
    public ImagenController(ImagenService imagenService) {
        super(imagenService);
    }
}

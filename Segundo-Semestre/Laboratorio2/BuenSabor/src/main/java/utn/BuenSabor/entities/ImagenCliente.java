package utn.BuenSabor.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "imagen_cliente")
public class ImagenCliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;

    public ImagenCliente() {}

    public ImagenCliente(String denominacion) {
        this.denominacion = denominacion;
    }
}

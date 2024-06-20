package utn.BuenSabor.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "imagen_promocion")
public class ImagenPromocion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;

    public ImagenPromocion() {}

    public ImagenPromocion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;


}

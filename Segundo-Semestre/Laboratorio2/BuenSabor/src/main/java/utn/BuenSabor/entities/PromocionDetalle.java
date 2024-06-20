package utn.BuenSabor.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class PromocionDetalle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;

    public PromocionDetalle() {}

    public PromocionDetalle (int cantidad) {
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;






}

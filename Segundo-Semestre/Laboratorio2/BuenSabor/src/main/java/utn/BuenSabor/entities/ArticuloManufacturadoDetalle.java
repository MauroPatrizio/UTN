package utn.BuenSabor.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "articulo_manufacturado_detalle")
public class ArticuloManufacturadoDetalle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    public ArticuloManufacturadoDetalle () {
    }

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloManufacturado articuloManufacturado) {
        this.cantidad = cantidad;
        this.articuloManufacturado = articuloManufacturado;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo_manufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;
}

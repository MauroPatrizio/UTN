package utn.BuenSabor.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ArticuloInsumo extends Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo() {
    }

    public ArticuloInsumo(String denominacion, Double precioVenta, Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar, UnidadMedida unidadMedida) {
        super(denominacion, precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        this.unidadMedida = unidadMedida;
    }

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}

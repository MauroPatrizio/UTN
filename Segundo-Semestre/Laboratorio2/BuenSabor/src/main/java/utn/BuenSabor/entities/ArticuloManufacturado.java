package utn.BuenSabor.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "articulo_manufactorado")
public class ArticuloManufacturado extends Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    public ArticuloManufacturado() {
    }

    public ArticuloManufacturado(String denominacion, Double precioVenta, String descripcion, Integer tiempoEstimadoMinutos, String preparacion, Categoria categoria, List<ArticuloManufacturadoDetalle> detalles) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.categoria = categoria;
        this.detalles = detalles;
    }

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "articuloManufacturado")
    private List<ArticuloManufacturadoDetalle> detalles;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<ArticuloManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<ArticuloManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }
}

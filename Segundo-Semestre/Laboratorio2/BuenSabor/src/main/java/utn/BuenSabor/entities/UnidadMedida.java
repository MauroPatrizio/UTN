package utn.BuenSabor.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "unidad_medida")
public class UnidadMedida implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;

    public UnidadMedida() {}

    public UnidadMedida(String denominacion) {
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
}

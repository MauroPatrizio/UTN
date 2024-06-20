package utn.BuenSabor.entities;


import jakarta.persistence.*;

import javax.naming.Name;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sucursal")
public class Sucursal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Boolean casaMatriz;

    public Sucursal() {}

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Boolean casaMatriz, Domicilio domicilio, Empresa empresa) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.casaMatriz = casaMatriz;
        this.domicilio = domicilio;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Boolean getCasaMatriz() {
        return casaMatriz;
    }

    public void setCasaMatriz(Boolean casaMatriz) {
        this.casaMatriz = casaMatriz;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="promocion_sucursal", joinColumns = @JoinColumn(name = "sucursal_id"), inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    private Set<Promocion> promocions = new HashSet<Promocion>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="categoria_sucursal", joinColumns = @JoinColumn(name = "sucursal_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private Set<Categoria> categorias = new HashSet<Categoria>();
}

package utn.ElBuenSabor.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sucursales")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal extends Base{

    private String nombre;
    @Column(name = "horario_apertura")
    private LocalTime horaApertura;
    @Column(name = "horario_cierre")
    private LocalTime horaCierre;
    @Column(name = "casa_matriz")
    private Boolean casaMatriz;

    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
                joinColumns = @JoinColumn(name = "sucursal_id"),
                inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    @Builder.Default
    @JsonManagedReference
    private Set<Categoria> categorias = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "sucursal_promocion",
    joinColumns = @JoinColumn(name = "sucursal_id"),
    inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    @Builder.Default
    @JsonManagedReference
    private Set<Promocion> promociones = new HashSet<>();

}

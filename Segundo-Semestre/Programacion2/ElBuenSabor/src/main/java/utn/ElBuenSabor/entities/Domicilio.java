package utn.ElBuenSabor.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "domicilios")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Domicilio extends Base{

    private String calle;
    private Integer numero;
    private Integer cp;

    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;

    @ManyToMany(mappedBy = "domicilios")
    @Builder.Default
    @JsonBackReference
    private Set<Cliente> clientes = new HashSet<>();
}

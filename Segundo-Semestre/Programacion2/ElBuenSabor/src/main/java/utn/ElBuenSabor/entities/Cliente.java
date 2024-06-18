package utn.ElBuenSabor.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente extends Persona{

    @ManyToMany
    @JoinTable(name = "cliente_domicilio",
                joinColumns = @JoinColumn(name = "cliente_id"),
                inverseJoinColumns = @JoinColumn(name = "domicilio_id"))
    @Builder.Default
    @JsonManagedReference
    private Set<Domicilio> domicilios = new HashSet<>();
}

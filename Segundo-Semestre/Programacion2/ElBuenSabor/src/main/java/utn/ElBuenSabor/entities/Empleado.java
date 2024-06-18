package utn.ElBuenSabor.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "empleados")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona{

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;
}

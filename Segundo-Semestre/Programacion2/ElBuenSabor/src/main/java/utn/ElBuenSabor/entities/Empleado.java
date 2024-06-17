package utn.ElBuenSabor.entities;

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
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;
}

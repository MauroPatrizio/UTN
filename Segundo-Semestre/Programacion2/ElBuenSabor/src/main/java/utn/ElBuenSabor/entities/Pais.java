package utn.ElBuenSabor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "paises")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pais extends Base{
    private String nombre;
}

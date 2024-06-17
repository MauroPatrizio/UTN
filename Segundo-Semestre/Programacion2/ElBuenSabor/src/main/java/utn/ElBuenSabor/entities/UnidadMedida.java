package utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "unidad_medida")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida extends Base{
    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
}

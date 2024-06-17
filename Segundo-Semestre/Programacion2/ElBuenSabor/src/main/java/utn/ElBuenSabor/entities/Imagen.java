package utn.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "imagen")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen extends Base{

    private String denominacion;
}

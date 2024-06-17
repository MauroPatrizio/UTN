package utn.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "empresas")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa extends Base{

    private String nombre;
    @Column(name = "razon_social")
    private String razonSocial;
    private Integer cuil;
}

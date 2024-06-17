package utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import utn.ElBuenSabor.entities.enums.Rol;

import java.awt.*;

@MappedSuperclass
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Persona extends Base{

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    @Column(name = "fecha_nacimiento")
    protected String fechaNacimiento;
    @Enumerated(EnumType.STRING)
    protected Rol rol;

    @OneToOne
    @JoinColumn(name = "imagen_id")
    protected Imagen imagenPersona;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    protected Usuario usuario;
}

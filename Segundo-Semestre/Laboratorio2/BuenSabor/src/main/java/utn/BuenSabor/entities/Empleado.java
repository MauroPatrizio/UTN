package utn.BuenSabor.entities;

import com.example.BuenSabor.enums.Rol;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    public Empleado(){
    }

    public Empleado(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Rol rol, ImagenEmpleado imagenEmpleado, UsuarioEmpleado usuarioEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.imagenEmpleado = imagenEmpleado;
        this.usuarioEmpleado = usuarioEmpleado;
    }

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagen_empleado_id")
    private ImagenEmpleado imagenEmpleado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_empleado_id")
    private UsuarioEmpleado usuarioEmpleado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sucursal_empleado_id")
    private Sucursal sucursal;


}

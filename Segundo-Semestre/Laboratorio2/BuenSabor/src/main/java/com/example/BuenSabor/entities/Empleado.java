package com.example.BuenSabor;

import com.example.BuenSabor.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "imagen_empleado_id")
    private ImagenEmpleado imagenEmpleado;

    @OneToOne
    @JoinColumn(name = "usuario_empleado_id")
    private UsuarioEmpleado usuarioEmpleado;
}

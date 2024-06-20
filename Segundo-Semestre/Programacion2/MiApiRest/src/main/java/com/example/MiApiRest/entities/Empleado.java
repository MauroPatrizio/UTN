package com.example.MiApiRest.entities;

import com.example.MiApiRest.entities.enums.TipoEmpleado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table (name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona implements Serializable {

    @Column(name = "tipo_empleado")
    private TipoEmpleado tipoEmpleado;
}

package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "personas")
@Data
@AllArgsConstructor //da todas los constructores sobrecargados
@NoArgsConstructor // da el constructor vacio
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    protected LocalDate fechaNacimiento;
}

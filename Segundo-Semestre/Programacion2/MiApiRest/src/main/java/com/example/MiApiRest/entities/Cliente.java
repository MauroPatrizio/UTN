package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Builder
public class Cliente extends Persona implements Serializable {

    public Cliente(Long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        super(id, nombre, apellido, telefono, email, fechaNacimiento);
    }

    public Cliente() {
    }

    public Cliente(PersonaBuilder<?, ?> b) {
        super(b);
    }
}

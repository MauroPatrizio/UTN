package com.example.MiApiRest.repositories;

import com.example.MiApiRest.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}

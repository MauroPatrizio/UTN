package com.example.MiApiRest.repositories;

import com.example.MiApiRest.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

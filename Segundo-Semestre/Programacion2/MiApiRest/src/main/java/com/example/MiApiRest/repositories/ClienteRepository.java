package com.example.MiApiRest.repositories;

import com.example.MiApiRest.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
}

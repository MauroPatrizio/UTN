package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Persona;
import com.example.MiApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona crearPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public List<Persona> listarPersonas(){
        return personaRepository.findAll();
    }

    public Persona buscarPersonaPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }

    public Persona actualizarPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public void eliminarPersona(Long id){
        personaRepository.deleteById(id);
    }

}
